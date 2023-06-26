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
import models.Customers;
import models.CustomersDao;
import static models.CustomersDao.customer_id;
import models.EmployeesDao;
import views.SystemView;

/* @author andre */
public class CustomersController implements ActionListener, MouseListener, KeyListener {

    private Customers customer;
    private CustomersDao customerDao;
    private SystemView views;

    String rol = EmployeesDao.rol_user;
    //Instanciar el modelo de tabla para interactuar
    DefaultTableModel model = new DefaultTableModel();

    public CustomersController(Customers customer, CustomersDao customerDao, SystemView views) {
        this.customer = customer;
        this.customerDao = customerDao;
        this.views = views;

        //Boton de registrar cliente
        this.views.btn_register_customer.addActionListener(this);

        //caja de texto en escucha
        this.views.txt_search_customer.addKeyListener(this);

        //Para poner la tabla en escucha.
        this.views.customer_table.addMouseListener(this);

        //label en escucha
        this.views.jLabelCustomers.addMouseListener(this);

        //poner en escucha boton modificar
        this.views.btn_update_customer.addActionListener(this);

        //Poner en escucha el boton Elimina.
        this.views.btn_delete_customer.addActionListener(this);

        //poner en escuchar el boton cancelar
        this.views.btn_cancel_customer.addActionListener(this);
        
        //Botones desabilitados 
        this.views.btn_update_customer.setEnabled(false);
        this.views.btn_delete_customer.setEnabled(false);
        this.views.btn_cancel_customer.setEnabled(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_register_customer) {
            //Verificar que los campos no esten vacios.
            if (views.txt_customer_id.getText().equals("")
                    || views.txt_customer_fullname.getText().equals("")
                    || views.txt_customer_telephone.getText().equals("")
                    || views.txt_customer_email.getText().equals("")
                    || views.txt_customer_addres.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");

            } else {
                //Realizar registro
                customer.setId(Integer.parseInt(views.txt_customer_id.getText().trim()));
                customer.setFull_name(views.txt_customer_fullname.getText().trim());
                customer.setTelephone(views.txt_customer_telephone.getText().trim());
                customer.setEmail(views.txt_customer_email.getText().trim());
                customer.setAddress(views.txt_customer_addres.getText().trim());

                if (customerDao.registerCustomersQuery(customer)) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado con exito.");

                    cleanTxt();
                    cleanTable();
                    listAllCustomers();

                } else {
                    JOptionPane.showMessageDialog(null, "Algo ha ocurrido al registrar el cliente.");
                }

            }
            //Modificar un cliente
        } else if (e.getSource() == views.btn_update_customer) {
            //Verificar si campo ID tiene algun dato
            if (views.txt_customer_id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla para continuar.");
            } else {

                //verificar campos vacios
                if (views.txt_customer_telephone.getText().equals("")
                        || views.txt_customer_fullname.getText().equals("")
                        || views.txt_customer_email.getText().equals("")
                        || views.txt_customer_addres.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                } else {

                    customer.setId(Integer.parseInt(views.txt_customer_id.getText().trim()));
                    customer.setFull_name(views.txt_customer_fullname.getText().trim());
                    customer.setTelephone(views.txt_customer_telephone.getText().trim());
                    customer.setEmail(views.txt_customer_email.getText().trim());
                    customer.setAddress(views.txt_customer_addres.getText().trim());

                    if (customerDao.updateCustomerQuery(customer)) {
                       

                        JOptionPane.showMessageDialog(null, "Cliente modificado con éxito.");

                        cleanTxt();
                        cleanTable();
                        listAllCustomers();

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el cliente, vuelva a intentarlo.");
                    }
                }
            }
            //Aca se utiliza el boton Eliminar.
        } else if (e.getSource() == views.btn_delete_customer) {
            int row = views.customer_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente de la tabla.");
                listAllCustomers();
            } else {
                int id = Integer.parseInt(views.customer_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "Está seguro que desea Eliminar éste Cliente?");

                if (question == 0 && customerDao.deleteCustomerQuery(id)) {
                    cleanTxt();
                    cleanTable();
                    listAllCustomers();
                    
                    JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito.");

                }
            }
            //Aca se utiliza el boton Cancelar.    
        } else if (e.getSource() == views.btn_cancel_customer) {
            cleanTxt();

            
        }
    }

    //Listar clientes
    public void listAllCustomers() {

        List<Customers> list = customerDao.listCustomerQuery(views.txt_search_customer.getText());

        model = (DefaultTableModel) views.customer_table.getModel();
        Object[] row = new Object[5];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getFull_name();
            row[2] = list.get(i).getTelephone();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getAddress();

            model.addRow(row);
        }
        views.customer_table.setModel(model);

    }

    public void cleanTxt() {
        views.txt_customer_id.setText("");
        views.txt_customer_id.setEditable(true);
        views.txt_customer_fullname.setText("");
        views.txt_customer_telephone.setText("");
        views.txt_customer_email.setText("");
        views.txt_customer_addres.setText("");

        views.btn_register_customer.setEnabled(true);
        views.btn_update_customer.setEnabled(false);
        views.btn_delete_customer.setEnabled(false);
        views.btn_cancel_customer.setEnabled(false);
        
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == views.customer_table) {
            
            
            //Para saber en que fila se hizo click
            int row = views.customer_table.rowAtPoint(e.getPoint());

            //con esto especificamos la fila y la columna
            views.txt_customer_id.setText(views.customer_table.getValueAt(row, 0).toString());
            views.txt_customer_fullname.setText(views.customer_table.getValueAt(row, 1).toString());
            views.txt_customer_telephone.setText(views.customer_table.getValueAt(row, 2).toString());
            views.txt_customer_email.setText(views.customer_table.getValueAt(row, 3).toString());
            views.txt_customer_addres.setText(views.customer_table.getValueAt(row, 4).toString());

            //deshabilitar
            views.txt_customer_id.setEditable(false);
            views.btn_register_customer.setEnabled(false);
           
            
            //Se habilitan botones modificar, eliminar y cancelar
            views.btn_update_customer.setEnabled(true);
            views.btn_delete_customer.setEnabled(true);
            views.btn_cancel_customer.setEnabled(true);
        
        }
        //Cuando haga click en el Label que dice Clientes
        else if (e.getSource() == views.jLabelCustomers) {

            views.jPanelCustomers.setBackground(new Color(0, 102, 102));
            views.jTabbedPestañas.setSelectedIndex(3);

            //Limpiar tabla,campos y listar los empleados
            cleanTable();
            cleanTxt();
            listAllCustomers();

        } //Cuando se haga click en la caja de texto para buscar, se limpiara la tabla y los datos en pantalla.
        else if (e.getSource() == views.txt_search_customer) {
            cleanTxt();
            cleanTable();
            listAllCustomers();

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
        if (e.getSource() == views.txt_search_customer) {
            cleanTable();
            listAllCustomers();

        }
    }

}
