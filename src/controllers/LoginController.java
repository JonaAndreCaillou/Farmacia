package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import models.Employees;
import models.EmployeesDao;
import views.LoginView;
import views.SystemView;

/* @author andre */
public class LoginController implements ActionListener {

    private Employees employee;
    private EmployeesDao employeeDao;
    private LoginView login_view;

    public LoginController(Employees employee, EmployeesDao employeeDao, LoginView login_view) {
        this.employee = employee;
        this.employeeDao = employeeDao;
        this.login_view = login_view;
        this.login_view.btn_enter.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Obtener los datos de la vista
        String user = login_view.txt_username.getText().trim();
        String pass = String.valueOf(login_view.txt_password.getPassword());

        //Condicional para el boton, si el usuario lo presiona...
        if (e.getSource() == login_view.btn_enter) {
            //Validar que uno de los campos no este vacios
            if (!user.equals("") || !pass.equals("")) {
                //Pasar los parametros del metodo login
                employee = employeeDao.loginQuery(user, pass);

                //Verificar la existencia del usuario
                if (employee.getUsername() != null) {

                    //Verificar el rol del usuario
                    if (employee.getRol().equals("Administrador")) {
                        SystemView admin = new SystemView();
                        admin.setVisible(true);
                        login_view.setVisible(false);

                    } else {
                        SystemView aux = new SystemView();
                        aux.setVisible(true);
                        login_view.setVisible(false);

                    }
                    this.login_view.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Uno de los campos está vacio.");
            }
        }
    }
}
