
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Customers;
import models.CustomersDao;
import views.SystemView;

/* @author andre */
public class CustomersController implements ActionListener{
    private Customers customer;
    private CustomersDao customerDao;
    private SystemView views;

    public CustomersController(Customers customer, CustomersDao customerDao, SystemView views) {
        this.customer = customer;
        this.customerDao = customerDao;
        this.views = views;
        
        //Boton de registrar cliente
        this.views.btn_register_customer.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btn_register_customer){
            //Verificar que los campos no esten vacios.
        }
    }
    
    
}
