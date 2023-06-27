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
public class CategoriesDao {

    //Instanciar conexion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Registrar caterogias
    public boolean registerCategoryQuery(Categories category) {
        String query = "INSERT INTO categories (id,name,created,updated) VALUES (?,?,?,?)";

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setInt(1, category.getId());
            pst.setString(2, category.getName());
            pst.setTimestamp(3, datetime);
            pst.setTimestamp(4, datetime);
            pst.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registar la categoria. " + e);

            return false;
        }
    }

    //Listar categorias
    public List listCategoryQuery(String value) {
        List<Categories> list_category = new ArrayList();

        String query = "SELECT * FROM categories";
        String query_search_category = "SELECT * FROM categories WHERE id LIKE '%" + value + "%'";

        try {
            conn = cn.getConnection();
            //crear condicional sobre el search
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_category);
                rs = pst.executeQuery();
            }

            while (rs.next()) {
                Categories category = new Categories();

                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));

                list_category.add(category);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        return list_category;
    }

    //Modificar categoria
    public boolean updateCategoryQuery(Categories category) {
        String query = "UPDATE categories SET name = ?, updated = ?"
                + ("WHERE id = ?");

        //obtener fecha y hora exacta
        Timestamp datetime = new Timestamp(System.currentTimeMillis());

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, category.getName());
            pst.setTimestamp(2, datetime);
            pst.setInt(3, category.getId());
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al modificar los datos de la categoria." + e);
            return false;
        }

    }

    //Eliminar categoria
    public boolean deleteCategoryQuery(int id) {
        String query = "DELETE FROM categories WHERE id = " + id;

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puedes eliminar una categoria que tenga relacion con otra tabla. " + e);

            return false;
        }

    }
}
