package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Employees;
import models.EmployeesDao;
import static models.EmployeesDao.rol_user;
import static models.EmployeesDao.user_id;
import views.SystemView;

/* @author andre */
public class EmployeesController implements ActionListener, MouseListener, KeyListener {

    private Employees employee;
    private EmployeesDao employeeDao;
    private SystemView views;

    //Rol
    String rol = rol_user;

    //para poder interactuar con la tabla se instancia DefaultTableModel()
    DefaultTableModel model = new DefaultTableModel();

    public EmployeesController(Employees employee, EmployeesDao employeeDao, SystemView views) {
        this.employee = employee;
        this.employeeDao = employeeDao;
        this.views = views;

        //Boton de registrar empleados
        this.views.btn_register_employee.addActionListener(this);

        //Para poner la tabla en escucha.
        this.views.employee_table.addMouseListener(this);

        //poner a escucha el a la caja de texto de buscar
        this.views.txt_search_employee.addKeyListener(this);

        //Escucha boton de modificar
        this.views.btn_update_employee.addActionListener(this);

        //Boton de eliminar empleado
        this.views.btn_delete_employee.addActionListener(this);

        //boton de cancelar
        this.views.btn_cancel_employee.addActionListener(this);

        //Boton modificar que es para cambiar contraseña en la pestaña de perfil
        this.views.btn_update_date.addActionListener(this);

        //Colocar Label en escucha
        this.views.jLabelEmplois.addMouseListener(this);
    }

    //registrar los empleados.
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == views.btn_register_employee) {
            //Verificar que ningun campo este vacio
            if (views.txt_employee_id.getText().equals("")
                    || views.txt_employee_fullname.getText().equals("")
                    || views.txt_employee_username.getText().equals("")
                    || views.txt_employee_addres.getText().equals("")
                    || views.txt_employee_email.getText().equals("")
                    || views.txt_employee_telephone.getText().equals("")
                    || views.cmb_rol.getSelectedItem().toString().equals("")
                    || String.valueOf(views.txt_employee_password.getPassword()).equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

            } else {
                //Realizar el registro
                employee.setId(Integer.parseInt(views.txt_employee_id.getText().trim()));
                employee.setFull_name(views.txt_employee_fullname.getText().trim());
                employee.setUsername(views.txt_employee_username.getText().trim());
                employee.setAddress(views.txt_employee_addres.getText().trim());
                employee.setEmail(views.txt_employee_email.getText().trim());
                employee.setTelephone(views.txt_employee_telephone.getText().trim());
                employee.setPassword(String.valueOf(views.txt_employee_password.getPassword()));
                employee.setRol(views.cmb_rol.getSelectedItem().toString());

                if (employeeDao.registerEmployeeQuery(employee)) {

                    JOptionPane.showMessageDialog(null, "Empleado registrado con exito.");

                    cleanTxt();
                    cleanTable();
                    listAllEmployees();

                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido algo al registar el empleado.");
                }

            }
            //Modificar empleados
        } else if (e.getSource() == views.btn_update_employee) {
            if (views.txt_employee_id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla para continuar.");
            } else {
                //verificar si los campos estan vacios 
                if (views.txt_employee_id.getText().equals("")
                        || views.txt_employee_fullname.getText().equals("")
                        || views.cmb_rol.getSelectedItem().toString().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                } else {
                    employee.setId(Integer.parseInt(views.txt_employee_id.getText().trim()));
                    employee.setFull_name(views.txt_employee_fullname.getText().trim());
                    employee.setUsername(views.txt_employee_username.getText().trim());
                    employee.setAddress(views.txt_employee_addres.getText().trim());
                    employee.setEmail(views.txt_employee_email.getText().trim());
                    employee.setTelephone(views.txt_employee_telephone.getText().trim());
                    employee.setPassword(String.valueOf(views.txt_employee_password.getPassword()));
                    employee.setRol(views.cmb_rol.getSelectedItem().toString());

                    if (employeeDao.updateEmployeeQuery(employee)) {

                        views.btn_register_employee.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Datos del empleado modificados con exito.");
                        cleanTxt();
                        cleanTable();
                        listAllEmployees();

                    } else {
                        JOptionPane.showMessageDialog(null, "Algo ha ocurrido con la modificacion");
                    }
                }
            }

            //Eliminar un empleado
            //Selecciona un empleado de la tabla y eliminar.
        } else if (e.getSource() == views.btn_delete_employee) {
            int row = views.employee_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado para eliminar.");
            } else if (views.employee_table.getValueAt(row, 0).equals(user_id)) {
                JOptionPane.showMessageDialog(null, "No puede eliminar al usuario autenticado");
            } else {
                int id = Integer.parseInt(views.employee_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "En realidad quieres eliminar a este empleado?");

                if (question == 0 && employeeDao.deleteEmployeeQuery(id) != false) {
                    cleanTxt();
                    views.btn_register_employee.setEnabled(true);
                    views.txt_employee_password.setEnabled(true);

                    JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");
                    cleanTable();
                }
                listAllEmployees();
            }
            // Cancelar pone en blanco las cajas de texto.
        } else if (e.getSource() == views.btn_cancel_employee) {
            cleanTxt();

            views.btn_register_employee.setEnabled(true);
            views.txt_employee_password.setEnabled(true);
            views.txt_employee_id.setEnabled(true);

            //esto es de la pestaña Perfil que es independiente de cada Empleado.
            //En esta pestaña se podra actualizar la contraseña.
        } else if (e.getSource() == views.btn_update_date) {
            //Recolectar informacion de las cajas pasword
            String password = String.valueOf(views.txt_password_modify.getPassword());
            String confirm_password = String.valueOf(views.txt_password_modify_confirmed.getPassword());

            //verificar que los campos no esten vacios
            if (!password.equals("") && !confirm_password.equals("")) {
                //verificar que las contraseñas sean iguales
                if (password.equals(confirm_password)) {
                    employee.setPassword(String.valueOf(views.txt_password_modify.getPassword()));
                    if (employeeDao.updateEmployeePassword(employee) != false) {
                        JOptionPane.showMessageDialog(null, "Contraseña modificada con exito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar la contraseña.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos tienen que estar completos.");
            }

        }

    }

    //Listar los empleados.
    public void listAllEmployees() {
        if (rol.equals("Administrador")) {
            List<Employees> list = employeeDao.listEmployeesQuery(views.txt_search_employee.getText());

            model = (DefaultTableModel) views.employee_table.getModel();
            Object[] row = new Object[7];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getFull_name();
                row[2] = list.get(i).getRol();
                row[3] = list.get(i).getUsername();
                row[4] = list.get(i).getAddress();
                row[5] = list.get(i).getTelephone();
                row[6] = list.get(i).getEmail();
                model.addRow(row);
            }
            views.employee_table.setModel(model);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.employee_table) {
            //Para saber en que fila se hizo click
            int row = views.employee_table.rowAtPoint(e.getPoint());

            //con esto especificamos la fila y la columna
            views.txt_employee_id.setText(views.employee_table.getValueAt(row, 0).toString());
            views.txt_employee_fullname.setText(views.employee_table.getValueAt(row, 1).toString());
            views.cmb_rol.setSelectedItem(views.employee_table.getValueAt(row, 2).toString());
            views.txt_employee_username.setText(views.employee_table.getValueAt(row, 3).toString());
            views.txt_employee_addres.setText(views.employee_table.getValueAt(row, 4).toString());
            views.txt_employee_telephone.setText(views.employee_table.getValueAt(row, 5).toString());
            views.txt_employee_email.setText(views.employee_table.getValueAt(row, 6).toString());

            //deshabilitar
            views.txt_employee_id.setEditable(false);
            views.txt_employee_password.setEnabled(false);
            views.btn_register_employee.setEnabled(false);
            views.cmb_rol.setEditable(false);
        } else if (e.getSource() == views.jLabelEmplois) {
            views.jPanelEmplois.setBackground(new Color(0, 102, 102));
            if(rol.equals("Administrador")){
                views.jTabbedPestañas.setSelectedIndex(4);
                
                //Limpiar tabla,campos y listar los empleados
                cleanTable();
                cleanTxt();
                listAllEmployees();
            }else{
                views.jTabbedPestañas.setEnabledAt(4, false);
                views.jLabelEmplois.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No puedes accerder a esta vista.");
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_search_employee) {
            cleanTable();
            listAllEmployees();

        }
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }

    public void cleanTxt() {
        views.txt_employee_id.setText("");
        views.txt_employee_id.setEditable(true);
        views.txt_employee_fullname.setText("");
        views.txt_employee_username.setText("");
        views.txt_employee_addres.setText("");
        views.txt_employee_email.setText("");
        views.txt_employee_telephone.setText("");
        views.txt_employee_password.setText("");
        views.cmb_rol.setSelectedIndex(0);
        views.txt_employee_password.setEnabled(true);

    }
}
