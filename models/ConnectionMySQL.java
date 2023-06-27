
package models;

import java.sql.*;

/**
 *
 * @author andre
 */
public class ConnectionMySQL {
    
    //Definir variables y las vamos a inicializar con la bases de datos y definimos la coneccion como null
    
    private String database_name = "pharmacy_database";
    private String user = "root";
    private String password = "ADMIN";
    private String url = "jdbc:mysql://localhost:3306/" + database_name;
    Connection conn = null;
    
    public Connection getConnection(){
        try{
            //obtener valor del driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtener la coneccion
            conn = DriverManager.getConnection(url, user, password);
        } catch(ClassNotFoundException e){
            System.err.println("Ha ocurrido un ClassNotFoundException" + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Ha ocurrido  un SQLException" + e.getMessage());
        }
        return conn;
    }
    
}
