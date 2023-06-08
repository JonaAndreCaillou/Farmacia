package models;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/* @author andre */
public class SuppliersDao {

    //Instanciar conexion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Registar proveedor
    public boolean registerSupplierQuery(Suppliers supplier) {
        String query = "INSERT INTO suppliers (name, description,address, telephone, email, city,created, updated)"
                + "VALUES ?,?,?,?,?,?,?,?";

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, supplier.getName());
            pst.setString(2, supplier.getDescription());
            pst.setString(3, supplier.getAddress());
            pst.setString(4, supplier.getTelephone());
            pst.setString(5, supplier.getEmail());
            pst.setString(6, supplier.getCity());
            pst.setTimestamp(7, datetime);
            pst.setTimestamp(8, datetime);
            pst.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar al proveedor. " + e);
            return false;
        }
    }

    //Listar proveedores
    public List listSupplierQuery(String value) {
        List<Suppliers> list_supplier = new ArrayList();

        String query = "SELECT * FROM suppliers";
        String query_search_supplier = "SELECT * FROM suppliers WHERE id LIKE '%" + value + "%'";

        try {
            conn = cn.getConnection();
            //crear condicional sobre el search
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_supplier);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                Suppliers supplier = new Suppliers();

                supplier.setId(rs.getInt("id"));
                supplier.setName(rs.getString("name"));
                supplier.setDescription(rs.getString("description"));
                supplier.setAddress(rs.getString("address"));
                supplier.setEmail(rs.getString("telephone"));
                supplier.setTelephone(rs.getString("email"));
                supplier.setCity(rs.getString("city"));

                list_supplier.add(supplier);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_supplier;
    }

    //Modificar proveedores
    public boolean updateSupplierQuery(Suppliers supplier) {
        String query = "UPDATE suppliers SET name = ?, description = ?, address = ?, telephone = ?, email = ?,city = ?, updated = ?"
                + ("WHERE id = ?");

        //obtener fecha y hora exacta
        Timestamp datetime = new Timestamp(System.currentTimeMillis());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, supplier.getName());
            pst.setString(2, supplier.getDescription());
            pst.setString(3, supplier.getAddress());
            pst.setString(4, supplier.getTelephone());
            pst.setString(5, supplier.getEmail());
            pst.setString(6, supplier.getCity());
            pst.setTimestamp(7, datetime);
            pst.setInt(8, supplier.getId());
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al modificar los datos del proveedor." + e);
            return false;
        }

    }
    
    //Eliminar proveedor
    public boolean deleteSupplierQuery(int id) {
        String query = "DELETE FROM suppliers WHERE id = " + id;

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puedes eliminar un proveedor que tenga relacion con otra tabla. " + e);
            return false;
        }

    }

}
