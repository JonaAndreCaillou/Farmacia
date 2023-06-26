package controllers;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static models.EmployeesDao.*;
import views.SystemView;

/*
 * @author andre
 */
public class SettingsController implements MouseListener {

    private SystemView views;

    public SettingsController(SystemView views) {
        this.views = views;

        this.views.jLabelProduct.addMouseListener(this);
        this.views.jLabelPurchises.addMouseListener(this);
        this.views.jLabelSales.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.jLabelEmplois.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);
        Profile();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(0, 102, 102));
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

        if (e.getSource() == views.jLabelProduct) {
            views.jPanelProduct.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelPurchises) {
            views.jPanelPurchises.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelSales) {
            views.jPanelSales.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelEmplois) {
            views.jPanelEmplois.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelSuppliers) {
            views.jPanelSuppliers.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(0, 102, 102));
        } else if (e.getSource() == views.jLabelSettings) {
            views.jPanelSettings.setBackground(new Color(0, 102, 102));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == views.jLabelProduct) {
            views.jPanelProduct.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelPurchises) {
            views.jPanelPurchises.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelSales) {
            views.jPanelSales.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(17, 43, 65));

        } else if (e.getSource() == views.jLabelEmplois) {
            views.jPanelEmplois.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelSuppliers) {
            views.jPanelSuppliers.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(17, 43, 65));
        } else if (e.getSource() == views.jLabelSettings) {
            views.jPanelSettings.setBackground(new Color(17, 43, 65));
        }

    }

    //Asignar el perfil del usuario
    public void Profile() {
        this.views.txt_profile_id.setText("" + user_id);
        this.views.txt_profile_fullname.setText(full_name_user);
        this.views.txt_profile_addres.setText(address_user);
        this.views.txt_profile_telephone.setText(telephone_user);
        this.views.txt_profile_email.setText(email_user);
    }

}
