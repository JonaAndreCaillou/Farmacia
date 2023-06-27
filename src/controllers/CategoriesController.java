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
import models.Categories;
import models.CategoriesDao;
import views.SystemView;

/* @author andre */
public class CategoriesController implements ActionListener, MouseListener, KeyListener {

    private Categories category;
    private CategoriesDao categoryDao;
    private SystemView views;

    //Se instancia DefaultTableModel
    DefaultTableModel model = new DefaultTableModel();

    public CategoriesController(Categories category, CategoriesDao categoryDao, SystemView views) {
        this.category = category;
        this.categoryDao = categoryDao;
        this.views = views;

        //ActionListener
        //Boton Registrar
        this.views.btn_register_category.addActionListener(this);
        //Boton Modificar
        this.views.btn_update_category.addActionListener(this);
        //Boton eliminar
        this.views.btn_delete_category.addActionListener(this);
        //Boton Cancelar
        this.views.btn_cancel_category.addActionListener(this);

        //MouseListener
        //Tabla
        this.views.category_table.addMouseListener(this);
        //Label categorias de la izquierda
        this.views.jLabelCategories.addMouseListener(this);

        //KeyListener
        //Search category
        this.views.txt_search_category.addKeyListener(this);

        //Botones deshabilitados
        this.views.btn_update_category.setEnabled(false);
        this.views.btn_delete_category.setEnabled(false);
        this.views.btn_cancel_category.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_register_category) {
            //Verificar que los campos esten llenos
            if (views.txt_category_id.getText().equals("")
                    || views.txt_category_name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            } else {
                //Realizar registro
                category.setId(Integer.parseInt(views.txt_category_id.getText().trim()));
                category.setName(views.txt_category_name.getText().trim());

                if (categoryDao.registerCategoryQuery(category)) {
                    cleanTxt();
                    cleanTable();
                    listAllCategories();

                    JOptionPane.showMessageDialog(null, "Categoria registrada con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Algo ha ocurrido durante el registro, vuelva a intentarlo.");
                }
            }
            //Modificar una categoria
        } else if (e.getSource() == views.btn_update_category) {
            //Verificar que esté el id
            if (views.txt_category_id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tiene que seleccionar una categoria de la tabla.");
            } else {
                //Realizar registro
                category.setId(Integer.parseInt(views.txt_category_id.getText().trim()));
                category.setName(views.txt_category_name.getText().trim());

                if (categoryDao.updateCategoryQuery(category)) {
                    cleanTxt();
                    cleanTable();
                    listAllCategories();

                    JOptionPane.showMessageDialog(null, "Categoria modificada con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Algo ha ocurrido en la modificacion, intentelo nuevamente.");
                }
            }
            //Boton eliminar 
        } else if (e.getSource() == views.btn_delete_category) {
            int row = views.category_table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una categoria de la tabla.");
                listAllCategories();
            } else {
                int id = Integer.parseInt(views.category_table.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "Está seguro que desea Eliminar ésta categoria?");

                if (question == 0 && categoryDao.deleteCategoryQuery(id)) {
                    cleanTxt();
                    cleanTable();
                    listAllCategories();

                    JOptionPane.showMessageDialog(null, "Categoria eliminada con éxito.");

                }
            }
            //Boton cancelar
        } else if (e.getSource() == views.btn_cancel_category) {
            cleanTxt();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.category_table) {
            
            //para saber en que fila de la tabla hizo click
            int row = views.category_table.rowAtPoint(e.getPoint());

            //estas especifican los datos en la fila y la columna
            views.txt_category_id.setText(views.category_table.getValueAt(row, 0).toString());
            views.txt_category_name.setText(views.category_table.getValueAt(row, 1).toString());

            //Deshabilitar 
            views.txt_category_id.setEditable(false);
            views.btn_register_category.setEnabled(false);

            //Se habilitan botones modificar,eliminar,cancelar
            views.btn_update_category.setEnabled(true);
            views.btn_delete_category.setEnabled(true);
            views.btn_cancel_category.setEnabled(true);

        } else if (e.getSource() == views.jLabelCategories) {

            views.jTabbedPestañas.setSelectedIndex(6);
            views.jLabelCategories.setBackground(new Color(0, 102, 102));

            //Limpiar tabla,campos y listar los empleados
            cleanTxt();
            cleanTable();
            listAllCategories();
        }
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {

    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {

    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {

    }

    @Override
    public void mouseExited(MouseEvent e
    ) {

    }

    @Override
    public void keyTyped(KeyEvent e
    ) {

    }

    @Override
    public void keyPressed(KeyEvent e
    ) {

    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
        if (e.getSource() == views.txt_search_category) {
            cleanTable();
            listAllCategories();

        }
    }

    public void cleanTxt() {
        views.txt_category_id.setText("");
        views.txt_category_id.setEditable(true);
        views.txt_category_name.setText("");
        views.btn_register_category.setEnabled(true);

        //Se deshabilitan botones
        views.btn_update_category.setEnabled(false);
        views.btn_delete_category.setEnabled(false);
        views.btn_cancel_category.setEnabled(false);
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    public void listAllCategories() {
        List<Categories> list = categoryDao.listCategoryQuery(views.txt_search_category.getText());

        model = (DefaultTableModel) views.category_table.getModel();
        Object[] row = new Object[2];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            model.addRow(row);
        }
        views.category_table.setModel(model);
    }

}
