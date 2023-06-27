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
import models.EmployeesDao;
import models.Suppliers;
import models.SuppliersDao;
import views.SystemView;

/* @author andre */

public class SuppliersController implements ActionListener, MouseListener, KeyListener {

    private Suppliers supplier;
    private SuppliersDao supplierDao;
    private SystemView views;

    String rol = EmployeesDao.rol_user;

//Se instancia el tableModel
    DefaultTableModel model = new DefaultTableModel();

    public SuppliersController(Suppliers supplier, SuppliersDao supplierDao, SystemView views) {
        this.supplier = supplier;
        this.supplierDao = supplierDao;
        this.views = views;

        //ActionListener
        //Boton registrar
        this.views.btn_register_supplier.addActionListener(this);

        //Boton modificar
        this.views.btn_updatee_supplier.addActionListener(this);

        //Boton eliminar
        this.views.btn_delete_supplier.addActionListener(this);

        //Boton cancelar
        this.views.btn_cancel_supplier.addActionListener(this);

        //MouseListener
        //Tabla
        this.views.supplier_table.addMouseListener(this);
        
        //LabelSuppliers de la izquierda
        this.views.jLabelSuppliers.addMouseListener(this);

        //KeyListener
        //Caja de texto Search
        this.views.txt_search_suppliers.addKeyListener(this);

        //Botones deshabilitados
        this.views.btn_updatee_supplier.setEnabled(false);
        this.views.btn_delete_supplier.setEnabled(false);
        this.views.btn_cancel_supplier.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_register_supplier) {
            //Verificar que los campos no estén vacíos
            if (views.txt_suppliers_id.getText().equals("")
                    || views.txt_suppliers_name.getText().equals("")
                    || views.txt_suppliers_addres.getText().equals("")
                    || views.txt_suppliers_telephone.getText().equals("")
                    || views.txt_suppliers_email.getText().equals("")
                    || views.txt_suppliers_description.getText().equals("")
                    || views.cmb_suppliers_city.getSelectedItem().toString().equals("")) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            } else {
                //Realizar registro
                supplier.setId(Integer.parseInt(views.txt_suppliers_id.getText().trim()));
                supplier.setName(views.txt_suppliers_name.getText().trim());
                supplier.setAddress(views.txt_suppliers_addres.getText().trim());
                supplier.setTelephone(views.txt_suppliers_telephone.getText().trim());
                supplier.setEmail(views.txt_suppliers_email.getText().trim());
                supplier.setDescription(views.txt_suppliers_description.getText().trim());
                supplier.setCity(views.cmb_suppliers_city.getSelectedItem().toString());

                if (supplierDao.registerSupplierQuery(supplier)) {
                    JOptionPane.showMessageDialog(null, "Proveedor registrado con éxito.");

                    cleanTxt();
                    cleanTable();
                    listAllSuppliers();
                } else {
                    JOptionPane.showMessageDialog(null, "Algo ha ocurrido al registrar el Proveedor.");
                }
            }
            //Modificar proveedor
        } else if (e.getSource() == views.btn_updatee_supplier) {
            //Verificar si campo Id tiene algun dato.
            if (views.txt_suppliers_id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione un proveedor de la tabla para continuar.");
            } else {
                //Verificar si hay campos vacios
                if (views.txt_suppliers_name.getText().equals("")
                        || views.txt_suppliers_addres.getText().equals("")
                        || views.txt_suppliers_telephone.getText().equals("")
                        || views.txt_suppliers_email.getText().equals("")
                        || views.txt_suppliers_description.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                } else {
                    supplier.setId(Integer.parseInt(views.txt_suppliers_id.getText().trim()));
                    supplier.setName(views.txt_suppliers_name.getText().trim());
                    supplier.setAddress(views.txt_suppliers_addres.getText().trim());
                    supplier.setTelephone(views.txt_suppliers_telephone.getText().trim());
                    supplier.setEmail(views.txt_suppliers_email.getText().trim());
                    supplier.setDescription(views.txt_suppliers_description.getText().trim());
                    supplier.setCity(views.cmb_suppliers_city.getSelectedItem().toString());

                    if (supplierDao.updateSupplierQuery(supplier)) {
                        JOptionPane.showMessageDialog(null, "Proveedor modificado con éxito.");

                        cleanTxt();
                        cleanTable();
                        listAllSuppliers();

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el proveedor, vuelva a intentarlo.");
                    }
                }
            }
            //Utilizamos el boton eliminar
        } else if (e.getSource() == views.btn_delete_supplier) {
            int row = views.supplier_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un proveedor de la tabla.");
                listAllSuppliers();
            } else {
                int id = Integer.parseInt(views.supplier_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "Está seguro que desea Eliminar éste Proveedor?");

                if (question == 0 && supplierDao.deleteSupplierQuery(id)) {
                    cleanTxt();
                    cleanTable();
                    listAllSuppliers();

                    JOptionPane.showMessageDialog(null, "proveedor eliminado con éxito.");

                }
            }
        } else if (e.getSource() == views.btn_cancel_supplier) {
            cleanTxt();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.supplier_table) {
            //para saber en que fila de la tabla hizo click
            int row = views.supplier_table.rowAtPoint(e.getPoint());

            //estas especifican los datos en la fila y la columna
            views.txt_suppliers_id.setText(views.supplier_table.getValueAt(row, 0).toString());
            views.txt_suppliers_name.setText(views.supplier_table.getValueAt(row, 1).toString());
            views.txt_suppliers_description.setText(views.supplier_table.getValueAt(row, 2).toString());
            views.txt_suppliers_addres.setText(views.supplier_table.getValueAt(row, 3).toString());
            views.txt_suppliers_telephone.setText(views.supplier_table.getValueAt(row, 4).toString());
            views.txt_suppliers_email.setText(views.supplier_table.getValueAt(row, 5).toString());
            views.cmb_suppliers_city.setSelectedItem(views.supplier_table.getValueAt(row, 6).toString());

            //Deshabilitar 
            views.txt_suppliers_id.setEditable(false);
            views.btn_register_supplier.setEnabled(false);

            //Se habilitan botones modificar,eliminar,cancelar
            views.btn_updatee_supplier.setEnabled(true);
            views.btn_delete_supplier.setEnabled(true);
            views.btn_cancel_supplier.setEnabled(true);

            //Poner en escuchar el label de proveedores 
        } else if (e.getSource() == views.jLabelSuppliers) {
            
            
            views.jTabbedPestañas.setSelectedIndex(5);
            views.jLabelSuppliers.setBackground(new Color(0, 102, 102));
            

            //Limpiar tabla,campos y listar los empleados
            cleanTxt();
            cleanTable();
            listAllSuppliers();
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
    }

    public void cleanTxt() {
        views.txt_suppliers_id.setText("");
        views.txt_suppliers_id.setEditable(true);
        views.txt_suppliers_name.setText("");
        views.txt_suppliers_addres.setText("");
        views.txt_suppliers_telephone.setText("");
        views.txt_suppliers_email.setText("");
        views.txt_suppliers_description.setText("");
        views.cmb_suppliers_city.setSelectedIndex(0);

        views.btn_register_supplier.setEnabled(true);
        views.btn_updatee_supplier.setEnabled(false);
        views.btn_delete_supplier.setEnabled(false);
        views.btn_cancel_supplier.setEnabled(false);
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    public void listAllSuppliers() {
        List<Suppliers> list = supplierDao.listSupplierQuery(views.txt_search_suppliers.getText());

        model = (DefaultTableModel) views.supplier_table.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getDescription();
            row[3] = list.get(i).getAddress();
            row[4] = list.get(i).getTelephone();
            row[5] = list.get(i).getEmail();
            row[6] = list.get(i).getCity();

            model.addRow(row);
        }
        views.supplier_table.setModel(model);
    }
}
