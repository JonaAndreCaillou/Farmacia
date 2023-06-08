package models;

import java.sql.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/* @author andre */

public class EmployeesDao {

    //Instancia la coneccion
    ConnectionMySQL cn = new ConnectionMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Variables para enviar datos entre interfaces
    public static int user_id = 0;
    public static String full_name_user = "";
    public static String username_user = "";
    public static String address_user = "";
    public static String rol_user = "";
    public static String telephone_user = "";
    public static String email_user = "";
    
    //Metodo de login
    public Employees loginQuery(String user, String password) {
        //Consulta en la base de datos
        String query = "SELECT * FROM employees WHERE username = ? AND password = ?";
        Employees employee = new Employees();
        try {
            //LLamamos a la coneccion y pasamos la consulta
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);

            //Enviar parametros
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();

            //Acceder a los setters ans getters del empleado
            if (rs.next()) {
                employee.setId(rs.getInt("id"));
                user_id = employee.getId();
                employee.setFull_name(rs.getString("full_name"));
                full_name_user = employee.getFull_name();
                employee.setUsername(rs.getString("username"));
                username_user = employee.getUsername();
                employee.setAddress(rs.getString("address"));
                address_user = employee.getAddress();
                employee.setRol(rs.getString("rol"));
                rol_user = employee.getRol();
                employee.setEmail(rs.getString("email"));
                email_user = employee.getEmail();
                employee.setTelephone(rs.getString("telephone"));
                telephone_user = employee.getTelephone();

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el empleado" + e);

        }

        return employee;

    }

    //Registrar empleados
    public boolean registerEmployeeQuery(Employees employee) {
        String query = "INSERT INTO employees(id, full_name, username, address, email, telephone, rol, password, created, updated) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        //obtener fecha y hora exacta
       
        Timestamp datetime = new Timestamp(System.currentTimeMillis());
        //Timestamp datetime = new Timestamp(new Date().getTime());
        
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, employee.getId());
            pst.setString(2, employee.getFull_name());
            pst.setString(3, employee.getUsername());
            pst.setString(4, employee.getAddress());
            pst.setString(5, employee.getEmail());
            pst.setString(6, employee.getTelephone());
            pst.setString(7, employee.getRol());
            pst.setString(8, employee.getPassword());
            pst.setTimestamp(9, datetime);
            pst.setTimestamp(10, datetime);
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al registrar el empleado" + e);
            return false;
        }

    }
    
    //Listar empleados
    public List listEmployeesQuery(String value){
        List<Employees> list_employees = new ArrayList();
        //Listar todos los empleados
        String query = "SELECT * FROM employees ORDER BY rol ASC";
        
        //Listar un empleado en especifico
        String query_search_employee = "SELECT * FROM employees WHERE id LIKE '%" + value + "%'";
        
        try{
            conn = cn.getConnection();
            //crear condicional sobre el search
            if(value.equalsIgnoreCase("")){
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_search_employee);
                rs = pst.executeQuery();
            }
            
        while(rs.next()){
            Employees employee = new Employees();
            
            employee.setId(rs.getInt("id"));
            employee.setFull_name(rs.getString("full_name"));
            employee.setUsername(rs.getString("username"));
            employee.setAddress(rs.getString("address"));
            employee.setEmail(rs.getString("email"));
            employee.setTelephone(rs.getString("telephone"));
            employee.setRol(rs.getString("rol"));
            
            list_employees.add(employee);
            
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return list_employees;
        
    }
    
    //Modificar empleado
    public boolean updateEmployeeQuery(Employees employee) {
        String query = "UPDATE employees SET full_name = ?, username = ?, address = ?, email = ?, telephone = ?, rol  = ?, updated =?"
                + ("WHERE id = ?");
        //obtener fecha y hora exacta
       
        Timestamp datetime = new Timestamp(System.currentTimeMillis());
        
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            
            pst.setString(1, employee.getFull_name());
            pst.setString(2, employee.getUsername());
            pst.setString(3, employee.getAddress());
            pst.setString(4, employee.getEmail());
            pst.setString(5, employee.getTelephone());
            pst.setString(6, employee.getRol());
            pst.setTimestamp(7, datetime);
            pst.setInt(8, employee.getId());
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al modificar los datos el empleado" + e);
            return false;
        }

    }
        
    //Eliminar un empleado
    public boolean deleteEmployeeQuery(int id){
        String query = "DELETE FROM employees WHERE id = " + id;
        
        try{
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puedes eliminar un empleado que tenga relacion con otra tabla. " + e);
            return false;
        }
        
    }

    //Moificar la contraseña
    public boolean updateEmployeePassword(Employees employee){
        String query = "UPDATE employees SET password = ? WHERE username  = '" + username_user + "'";
        
        try{
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, employee.getPassword());
            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar la contraseña. " + e);
            return false;
        }
    }
}
