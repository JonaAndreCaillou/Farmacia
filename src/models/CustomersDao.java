package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/* @author andre */
public class CustomersDao {

    //Instancia la coneccion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Datos para enviar entre interfaces
    public static int customer_id = 0;
    public static String customer_full_name = "";
    public static String customer_telephone = "";
    public static String customer_email = "";
    public static String customer_Address = "";

    //Registrar cliente
    public boolean registerCustomersQuery(Customers customer) {

        String query = "INSERT INTO customers(id, full_name, telephone, email, address, created, updated) "
                + "VALUES (?,?,?,?,?,?,?)";

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, customer.getId());
            pst.setString(2, customer.getFull_name());
            pst.setString(3, customer.getTelephone());
            pst.setString(4, customer.getEmail());
            pst.setString(5, customer.getAddress());
            pst.setTimestamp(6, datetime);
            pst.setTimestamp(7, datetime);
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente." + e);
            return false;
        }
    }

    //Listar clientes
    public List listCustomerQuery(String value) {
        List<Customers> list_customers = new ArrayList();

        String query = "SELECT * FROM customers ORDER BY id desc";
        String query_search_customer = "SELECT * FROM customers WHERE id LIKE '%" + value + "%' ORDER BY id desc";

        try {
            conn = cn.getConnection();
            //crear condicional sobre el search
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_customer);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                Customers customer = new Customers();

                customer.setId(rs.getInt("id"));
                customer.setFull_name(rs.getString("full_name"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setAddress(rs.getString("address"));
                list_customers.add(customer);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_customers;

    }
    
    

    //Modificar Clientes
    public boolean updateCustomerQuery(Customers customer) {
        String query = "UPDATE customers SET full_name = ?, telephone = ?, email = ?, address = ?, updated = ? "
                + ("WHERE id = ?");
        //obtener fecha y hora exacta

        Timestamp datetime = new Timestamp(System.currentTimeMillis());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            
            pst.setString(1, customer.getFull_name());
            pst.setString(2, customer.getTelephone());
            pst.setString(3, customer.getEmail());
            pst.setString(4, customer.getAddress());
            pst.setTimestamp(5, datetime);
            pst.setInt(6, customer.getId());
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al modificar los datos del cliente" + e);
            return false;
        }

    }

    //Eliminar clientes
    public boolean deleteCustomerQuery(int id) {
        String query = "DELETE FROM customers WHERE id = " + id;

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puedes eliminar un cliente que tenga relacion con otra tabla. " + e);
            return false;
        }

    }

}
