package models;

/* @author andre */
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

//DAO Data Access Object
public class SalesDao {

    ConnectionMySQL cn = new ConnectionMySQL();

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Registrar una venta
    public boolean registerSalesQuery(int customer_id, int employee_id, double total) {
        String query = "INSERT INTO sales (customer_id, employee_id, total, sales_date) "
                + "VALUES (?,?,?,?)";

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setInt(1, customer_id);
            pst.setInt(2, employee_id);
            pst.setDouble(3, total);
            pst.setTimestamp(4, datetime);
            pst.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    //Registrar detalles de una venta
    public boolean registerDetailsSaleQuery(int product_id, int sale_id, double sale_price, double sale_subtotal, int sale_quantity) {
        String query = "INSERT INTO sale_details (product_id, sale_id, sale_price, sale_subtotal, sale_quantity ) "
                + "VALUES (?,?,?,?,?)";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, product_id);
            pst.setInt(2, sale_id);
            pst.setDouble(3, sale_price);
            pst.setDouble(4, sale_subtotal);
            pst.setInt(5, sale_quantity);

            pst.execute();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

            return false;
        }
    }

    //Obtener el maximo de ventas con ID
    public int saleId() {
        int id = 0;
        String query = "SELECT MAX(id) FROM sales";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return id;
    }

    //Listar todas las ventas
    public List listAllSalesQuery() {
        List<Sales> list_sales = new ArrayList();

        String query = "SELECT s.id AS invoice, em.full_name AS employee, cus.full_name AS customer, s.total, s.sale_date AS date"
                + "FROM sales s"
                + "INNER JOIN employees em ON em.id =  s.employee_id"
                + "INNER JOIN customers cus ON cus.id = s.customer_id"
                + "ORDER BY s.id ASC";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.executeQuery();

            while (rs.next()) {
                Sales sale = new Sales();

                sale.setId(rs.getInt("invoice"));
                sale.setEmployee_name(rs.getString("employee"));
                sale.setCustomer_name(rs.getString("customer"));
                sale.setTotal_to_pay(rs.getDouble("total"));
                sale.setSale_date(rs.getString("date"));

                list_sales.add(sale);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_sales;
    }
}
