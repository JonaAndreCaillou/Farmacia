package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/* @author andre */
public class PurchasesDao {

    //Instanciar conexion con bdd
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Registrar compra
    public boolean registerPurchaseQuery(int supplier_id, int employee_id, double total) {
        String query = "INSERT INTO purchases (supplier_id, employee_id, total, created) "
                + "VALUES (?,?,?,?)";

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, supplier_id);
            pst.setInt(2, employee_id);
            pst.setDouble(3, total);
            pst.setTimestamp(4, datetime);
            pst.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la compra." + e);
            return false;
        }
    }

    //Registrar detalles de la compra
    public boolean registerPurchaseDetailQuery(int purchase_id, double purchase_price, int purchase_amount,
            double purchase_subtotal, int product_id) {

        String query = "INSERT INTO purchases_details (puchases_id, purchase_price, purchase_amount, purchase_subtotal,purchase_date, product_id) "
                + "VALUES (?,?,?,?,?,?)";

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, purchase_id);
            pst.setDouble(2, purchase_price);
            pst.setInt(3, purchase_amount);
            pst.setDouble(4, purchase_subtotal);
            pst.setTimestamp(5, datetime);
            pst.setInt(6, product_id);
            pst.execute();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar los detalles de la compra." + e);
            return false;
        }
    }

    //Obtener id de la compra
    public int purchaseId() {
        int id = 0;
        String query = "SELECT MAX (id) AS id FROM purchases";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la compra." + e);

        }
        return id;
    }

    //Listar todas la compras realizadas
    public List listAllPurchaseQuery() {
        List<Purchases> list_purchases = new ArrayList();

        String query = " SELECT pu.* , su.name AS Supplier_name  FROM purchases pu, suppliers su"
                + "WHERE pu.supplier_id = su.id ORDER BY pu.id ASC";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                Purchases purchase = new Purchases();

                purchase.setId(rs.getInt("id"));
                purchase.setSupplier_name_products("supplier_name");
                purchase.setTotal(rs.getDouble("total"));
                purchase.setCreated(rs.getString("created"));
                list_purchases.add(purchase);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return list_purchases;
    }

    //Listar compras para imprimir factura
    public List listPurchaseDetailQuery(int id) {
        List<Purchases> list_purchases = new ArrayList();

        String query = "SELECT pu.created, pude.purchase_price, pude.purchase_amount, pude.purchase_subtotal,"
                + "su.name AS Supplier_name, pro.name AS product_name, em.full_name "
                + "FROM purchases pu "
                + "INNER JOIN purchases_details pude ON pu.id = pude.purchase_id "
                + "INNER JOIN products pro ON pude.product_id = pro.id "
                + "INNER JOIN suppliers su ON supplier_id = su.id "
                + "INNER JOIN employees em ON pu.employee_id = em.id WHERE pu.id = ?";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {
                Purchases purchase = new Purchases();

                purchase.setProduct_name(rs.getString("product_name"));
                purchase.setPurchase_amount(rs.getInt("purchase_amount"));
                purchase.setPurchace_price(rs.getDouble("purchase_price"));
                purchase.setPurchase_subtotal(rs.getDouble("purchase_subtotal"));
                purchase.setSupplier_name_products(rs.getString("supplier_name"));
                purchase.setCreated(rs.getString("created"));
                purchase.setPurcharser(rs.getString("full_name"));
                list_purchases.add(purchase);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return list_purchases;
    }
}
