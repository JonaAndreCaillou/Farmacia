/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.CategoriesController;
import controllers.CustomersController;
import controllers.EmployeesController;
import controllers.SettingsController;
import controllers.SuppliersController;
import models.Categories;
import models.CategoriesDao;
import models.Customers;
import models.Employees;
import models.EmployeesDao;
import models.CustomersDao;
import static models.EmployeesDao.full_name_user;
import static models.EmployeesDao.rol_user;
import models.Suppliers;
import models.SuppliersDao;

/**
 *
 * @author andre
 */
public class SystemView extends javax.swing.JFrame {

    //Empleados
    Employees employee = new Employees();
    EmployeesDao employeeDao = new EmployeesDao();
    
    //Clientes
    Customers customer = new Customers();
    CustomersDao customerDao = new CustomersDao();
    
    //Proveedores
    Suppliers supplier = new Suppliers();
    SuppliersDao supplierDao = new SuppliersDao();
    
    //Categorias
    Categories category = new Categories();
    CategoriesDao categoryDao = new CategoriesDao();
    
    
    public SystemView() {
        initComponents();
        setSize(1208, 680);
        setResizable(false);
        setTitle("Panel de Administracion");
        setLocationRelativeTo(null);

        tittleInterface();
        
        //Controlador del Setings
        SettingsController setting = new SettingsController(this);
        this.repaint();
        
        //Controlador de empleados
        EmployeesController employee_acount = new EmployeesController(employee, employeeDao, this);
        employee_acount.listAllEmployees();
        
        //controlador de clientes
        CustomersController customer_acount = new CustomersController(customer, customerDao, this);
        customer_acount.listAllCustomers();
        
        //Controlardor de Proveedores
        SuppliersController supplier_acount = new SuppliersController(supplier, supplierDao, this);
        supplier_acount.listAllSuppliers();
        
        //controlador de categorias
        CategoriesController category_acount = new CategoriesController(category, categoryDao, this);
        category_acount.listAllCategories();
    }
    
    public String tittleInterface(){
        setTitle("Panel - "+ rol_user);
        lbl_name_employee.setText(full_name_user);
        lbl_name_rol.setText(rol_user);
        return rol_user.trim();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jPanelProduct = new javax.swing.JPanel();
        jLabelProduct = new javax.swing.JLabel();
        jPanelPurchises = new javax.swing.JPanel();
        jLabelPurchises = new javax.swing.JLabel();
        jPanelSales = new javax.swing.JPanel();
        jLabelSales = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelEmplois = new javax.swing.JPanel();
        jLabelEmplois = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategories = new javax.swing.JPanel();
        jLabelCategories = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReports = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        lbl_name_employee = new javax.swing.JLabel();
        lbl_name_rol = new javax.swing.JLabel();
        jTabbedPestañas = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_product_code = new javax.swing.JTextField();
        txt_product_name = new javax.swing.JTextField();
        txt_product_unit_price = new javax.swing.JTextField();
        txt_product_description = new javax.swing.JTextField();
        txt_product_id = new javax.swing.JTextField();
        cmb_product_category = new javax.swing.JComboBox<>();
        btn_register_product = new javax.swing.JButton();
        btn_update_product = new javax.swing.JButton();
        btn_delete_product = new javax.swing.JButton();
        btn_cancel_product = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_search_product = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        products_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_purchase_product_code = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txt_purchase_amount = new javax.swing.JTextField();
        cmb_puchase_supplier = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tct_purchase_price = new javax.swing.JTextField();
        txt_purchase_subtotal = new javax.swing.JTextField();
        txt_purchase_id = new javax.swing.JTextField();
        txt_purchase_total_topay = new javax.swing.JTextField();
        btn_add_product_topay = new javax.swing.JButton();
        btn_confirm_purchase = new javax.swing.JButton();
        btn_remove_purchase = new javax.swing.JButton();
        btn_new_purchase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchases_table = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txt_sale_product_code = new javax.swing.JTextField();
        txt_sale_product_name = new javax.swing.JTextField();
        txt_sale_quantity = new javax.swing.JTextField();
        txt_sale_customer_id = new javax.swing.JTextField();
        txt_sale_total_to_pay = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txt_sale_product_id = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_sale_price = new javax.swing.JTextField();
        txt_sale_subtotal = new javax.swing.JTextField();
        txt_sale_stock = new javax.swing.JTextField();
        txt_sale_customer_name = new javax.swing.JTextField();
        btn_add_product_sale = new javax.swing.JButton();
        btn_confirm_sale = new javax.swing.JButton();
        btn_remove_sale = new javax.swing.JButton();
        btn_new_sale = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        sales_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_customer_id = new javax.swing.JTextField();
        txt_customer_fullname = new javax.swing.JTextField();
        txt_customer_addres = new javax.swing.JTextField();
        txt_customer_telephone = new javax.swing.JTextField();
        txt_customer_email = new javax.swing.JTextField();
        btn_register_customer = new javax.swing.JButton();
        btn_update_customer = new javax.swing.JButton();
        btn_delete_customer = new javax.swing.JButton();
        btn_cancel_customer = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_search_customer = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        jPanelEmployees = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_employee_id = new javax.swing.JTextField();
        txt_employee_fullname = new javax.swing.JTextField();
        txt_employee_username = new javax.swing.JTextField();
        cmb_rol = new javax.swing.JComboBox<>();
        txt_employee_addres = new javax.swing.JTextField();
        txt_employee_telephone = new javax.swing.JTextField();
        txt_employee_email = new javax.swing.JTextField();
        btn_register_employee = new javax.swing.JButton();
        btn_update_employee = new javax.swing.JButton();
        btn_delete_employee = new javax.swing.JButton();
        btn_cancel_employee = new javax.swing.JButton();
        txt_employee_password = new javax.swing.JPasswordField();
        jLabel31 = new javax.swing.JLabel();
        txt_search_employee = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        employee_table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_suppliers_name = new javax.swing.JTextField();
        txt_suppliers_addres = new javax.swing.JTextField();
        txt_suppliers_telephone = new javax.swing.JTextField();
        txt_suppliers_email = new javax.swing.JTextField();
        btn_register_supplier = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_suppliers_description = new javax.swing.JTextField();
        cmb_suppliers_city = new javax.swing.JComboBox<>();
        txt_suppliers_id = new javax.swing.JTextField();
        btn_updatee_supplier = new javax.swing.JButton();
        btn_cancel_supplier = new javax.swing.JButton();
        btn_delete_supplier = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txt_search_suppliers = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        supplier_table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_category_id = new javax.swing.JTextField();
        txt_category_name = new javax.swing.JTextField();
        btn_register_category = new javax.swing.JButton();
        btn_update_category = new javax.swing.JButton();
        btn_delete_category = new javax.swing.JButton();
        btn_cancel_category = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        txt_search_category = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        category_table = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_all_purchases = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_all_sales = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txt_profile_id = new javax.swing.JTextField();
        txt_profile_fullname = new javax.swing.JTextField();
        txt_profile_addres = new javax.swing.JTextField();
        txt_profile_telephone = new javax.swing.JTextField();
        txt_profile_email = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btn_update_date = new javax.swing.JButton();
        txt_password_modify = new javax.swing.JPasswordField();
        txt_password_modify_confirmed = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 43, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelProduct.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 175303.png"))); // NOI18N
        jLabelProduct.setText("  Productos");
        jLabelProduct.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanelProductLayout = new javax.swing.GroupLayout(jPanelProduct);
        jPanelProduct.setLayout(jPanelProductLayout);
        jPanelProductLayout.setHorizontalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProductLayout.setVerticalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 35));

        jPanelPurchises.setBackground(new java.awt.Color(17, 43, 65));

        jLabelPurchises.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPurchises.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPurchises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 175229.png"))); // NOI18N
        jLabelPurchises.setText("    Compras");
        jLabelPurchises.setToolTipText("");

        javax.swing.GroupLayout jPanelPurchisesLayout = new javax.swing.GroupLayout(jPanelPurchises);
        jPanelPurchises.setLayout(jPanelPurchisesLayout);
        jPanelPurchisesLayout.setHorizontalGroup(
            jPanelPurchisesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPurchisesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPurchises, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPurchisesLayout.setVerticalGroup(
            jPanelPurchisesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchisesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPurchises, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelPurchises, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 200, 35));

        jPanelSales.setBackground(new java.awt.Color(17, 43, 65));

        jLabelSales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 175501.png"))); // NOI18N
        jLabelSales.setText("   Ventas");

        javax.swing.GroupLayout jPanelSalesLayout = new javax.swing.GroupLayout(jPanelSales);
        jPanelSales.setLayout(jPanelSalesLayout);
        jPanelSalesLayout.setHorizontalGroup(
            jPanelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSales, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        jPanelSalesLayout.setVerticalGroup(
            jPanelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(17, 43, 65));

        jLabelCustomers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 180726.png"))); // NOI18N
        jLabelCustomers.setText("    Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addComponent(jLabelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 200, 35));

        jPanelEmplois.setBackground(new java.awt.Color(17, 43, 65));

        jLabelEmplois.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmplois.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmplois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 180812.png"))); // NOI18N
        jLabelEmplois.setText("   Empleados");

        javax.swing.GroupLayout jPanelEmploisLayout = new javax.swing.GroupLayout(jPanelEmplois);
        jPanelEmplois.setLayout(jPanelEmploisLayout);
        jPanelEmploisLayout.setHorizontalGroup(
            jPanelEmploisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmploisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEmplois, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEmploisLayout.setVerticalGroup(
            jPanelEmploisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmploisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmplois, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelEmplois, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(17, 43, 65));

        jLabelSuppliers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 180840.png"))); // NOI18N
        jLabelSuppliers.setText("    Proveedores");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuppliersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 200, 35));

        jPanelCategories.setBackground(new java.awt.Color(17, 43, 65));

        jLabelCategories.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCategories.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 180906.png"))); // NOI18N
        jLabelCategories.setText("   Categorias");

        javax.swing.GroupLayout jPanelCategoriesLayout = new javax.swing.GroupLayout(jPanelCategories);
        jPanelCategories.setLayout(jPanelCategoriesLayout);
        jPanelCategoriesLayout.setHorizontalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCategoriesLayout.setVerticalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriesLayout.createSequentialGroup()
                .addComponent(jLabelCategories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanelCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 35));

        jPanelReports.setBackground(new java.awt.Color(17, 43, 65));

        jLabelReports.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 175110.png"))); // NOI18N
        jLabelReports.setText("      Reportes");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReports, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelReports, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 200, 35));

        jPanelSettings.setBackground(new java.awt.Color(17, 43, 65));

        jLabelSettings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 180937.png"))); // NOI18N
        jLabelSettings.setText("  Configuracion");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addComponent(jLabelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 200, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-26 174407.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel3.setBackground(new java.awt.Color(17, 43, 65));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Farmacia Vida Natural");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 80));

        btn_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Captura de pantalla 2023-04-28 174959.png"))); // NOI18N
        btn_foto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 80, 65));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout.setText("Salir");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 35, -1, 30));

        lbl_name_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name_employee.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lbl_name_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 210, 20));

        lbl_name_rol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name_rol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lbl_name_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 210, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        jTabbedPestañas.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Precio de venta");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Categoria");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID");

        txt_product_id.setEditable(false);
        txt_product_id.setEnabled(false);
        txt_product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_idActionPerformed(evt);
            }
        });

        btn_register_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register_product.setText("Registrar");
        btn_register_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_productActionPerformed(evt);
            }
        });

        btn_update_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update_product.setText("Modificar");
        btn_update_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_productActionPerformed(evt);
            }
        });

        btn_delete_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete_product.setText("Eliminar");

        btn_cancel_product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel_product.setText("Cancelar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_product_unit_price, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txt_product_code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_product_category, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(112, 112, 112)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_delete_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_register_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update_product, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_cancel_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_product))
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmb_product_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_product))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_product_unit_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_product))
                .addGap(21, 21, 21)
                .addComponent(btn_cancel_product)
                .addGap(21, 21, 21))
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buscar");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txt_search_product.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(txt_search_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 165, 30));

        products_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Nombre", "Codigo", "Precio de venta", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(products_table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 920, 110));

        jTabbedPestañas.addTab("Productos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Codigo del producto");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nombre del producto");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Cantidad");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Proveedor");

        txt_purchase_product_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchase_product_codeActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Precio de compra");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("SubTotal");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("ID");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Total a Pagar");

        txt_purchase_subtotal.setEditable(false);

        txt_purchase_id.setEditable(false);
        txt_purchase_id.setEnabled(false);
        txt_purchase_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchase_idActionPerformed(evt);
            }
        });

        txt_purchase_total_topay.setEditable(false);

        btn_add_product_topay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add_product_topay.setText("Agregar");
        btn_add_product_topay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_product_topayActionPerformed(evt);
            }
        });

        btn_confirm_purchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_confirm_purchase.setText("Comprar");

        btn_remove_purchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_remove_purchase.setText("Eliminar");

        btn_new_purchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_new_purchase.setText("Nuevo");
        btn_new_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_purchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_purchase_amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txt_purchase_product_code, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cmb_puchase_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_purchase_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tct_purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_total_topay, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 53, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_new_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_add_product_topay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_confirm_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_remove_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_purchase_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(tct_purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_purchase_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_confirm_purchase))))
                    .addComponent(btn_add_product_topay, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_purchase_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchase_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_remove_purchase)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmb_puchase_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_purchase_total_topay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_purchase))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 310));

        purchases_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre del Producto", "Cantidad", "Precio", "Subtotal", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(purchases_table);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 920, 110));

        jTabbedPestañas.addTab("Compras", jPanel5);

        jPanel19.setBackground(new java.awt.Color(0, 102, 102));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Código del producto:");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Nombre del producto:");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Cantidad:");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Cédula del cliente:");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Total a pagar:");

        txt_sale_product_name.setEditable(false);

        txt_sale_total_to_pay.setEditable(false);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("ID:");

        txt_sale_product_id.setEditable(false);
        txt_sale_product_id.setEnabled(false);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Precio:");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("SubTotal:");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Stock:");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Nombre del producto:");

        txt_sale_price.setEditable(false);

        txt_sale_subtotal.setEditable(false);

        txt_sale_stock.setEditable(false);

        txt_sale_customer_name.setEditable(false);

        btn_add_product_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add_product_sale.setText("Agregar");

        btn_confirm_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_confirm_sale.setText("Vender");

        btn_remove_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_remove_sale.setText("Eliminar");

        btn_new_sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_new_sale.setText("Nuevo");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(txt_sale_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56)
                        .addGap(2, 2, 2)
                        .addComponent(txt_sale_product_id))
                    .addComponent(txt_sale_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sale_price, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_new_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txt_sale_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(txt_sale_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(txt_sale_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_sale))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(txt_sale_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(txt_sale_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_confirm_sale)))
                .addGap(32, 32, 32)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txt_sale_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(txt_sale_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_remove_sale)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_new_sale))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txt_sale_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(txt_sale_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(txt_sale_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 370));

        sales_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id del producto", "Nombre", "Cantidad", "Precio venta", "Subtotal", "Nombre del cliente"
            }
        ));
        jScrollPane10.setViewportView(sales_table);

        jPanel19.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 910, 100));

        jTabbedPestañas.addTab("Ventas", jPanel19);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Identificacion");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Nombre completo");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Direccion");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Teléfono");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Correo");

        btn_register_customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register_customer.setText("Registrar");
        btn_register_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_customerActionPerformed(evt);
            }
        });

        btn_update_customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update_customer.setText("Modificar");

        btn_delete_customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete_customer.setText("Eliminar");

        btn_cancel_customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel_customer.setText("Cancelar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_customer_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_customer_id, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txt_customer_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_customer_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_register_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_customer_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_customer))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txt_customer_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_update_customer)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btn_delete_customer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel_customer)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_customer_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Buscar");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 316, -1, 20));

        txt_search_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_customerActionPerformed(evt);
            }
        });
        jPanel6.add(txt_search_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 165, 30));
        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-452, -427, -1, -1));

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre completo", "Telefono", "Email", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(customer_table);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 120));

        jTabbedPestañas.addTab("Cliente", jPanel6);

        jPanelEmployees.setBackground(new java.awt.Color(0, 102, 102));
        jPanelEmployees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Identificacion");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Nombre completo");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Nombre de Usuario");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Rol");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Dirección");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Teléfono");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Email");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Contraseña");

        cmb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Administrador", "Auxiliar" }));
        cmb_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_rolActionPerformed(evt);
            }
        });

        txt_employee_telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_employee_telephoneActionPerformed(evt);
            }
        });

        txt_employee_email.setText(" ");

        btn_register_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register_employee.setText("Registrar");
        btn_register_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_employeeActionPerformed(evt);
            }
        });

        btn_update_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update_employee.setText("Modificar");

        btn_delete_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete_employee.setText("Eliminar");

        btn_cancel_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel_employee.setText("Cancelar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(38, 38, 38)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_employee_id, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txt_employee_fullname)
                    .addComponent(cmb_rol, 0, 157, Short.MAX_VALUE)
                    .addComponent(txt_employee_username))
                .addGap(76, 76, 76)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(38, 38, 38)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_employee_addres, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txt_employee_password)
                    .addComponent(txt_employee_email)
                    .addComponent(txt_employee_telephone))
                .addGap(85, 85, 85)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_cancel_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete_employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_update_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_register_employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btn_delete_employee)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel_employee))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txt_employee_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_register_employee))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(txt_employee_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_update_employee))
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(txt_employee_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30)
                            .addComponent(txt_employee_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_employee_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txt_employee_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jPanelEmployees.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 300));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Buscar");
        jPanelEmployees.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 80, -1));

        txt_search_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_employeeActionPerformed(evt);
            }
        });
        jPanelEmployees.add(txt_search_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 165, 30));

        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre completo", "Rol", "Nombre de Usuario", "Dirección", "Teléfono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(employee_table);

        jPanelEmployees.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 910, 110));

        jTabbedPestañas.addTab("Empleados", jPanelEmployees);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Nombre");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Dirección");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Teléfono");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Email");

        btn_register_supplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register_supplier.setText("Registrar");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Descripción");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Ciudad");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("ID");

        cmb_suppliers_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Hurlingham", "San Miguel", "Morón", "Palomar", "Castelar", "Ituzaingó", "Bella Vista", "Muñiz" }));

        btn_updatee_supplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_updatee_supplier.setText("Modificar");

        btn_cancel_supplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel_supplier.setText("Cancelar");

        btn_delete_supplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete_supplier.setText("Eliminar");
        btn_delete_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_supplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_suppliers_name, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(txt_suppliers_addres)
                    .addComponent(txt_suppliers_telephone)
                    .addComponent(txt_suppliers_email))
                .addGap(48, 48, 48)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_suppliers_city, 0, 165, Short.MAX_VALUE)
                    .addComponent(txt_suppliers_description)
                    .addComponent(txt_suppliers_id))
                .addGap(156, 156, 156)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_register_supplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cancel_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_delete_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_updatee_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_suppliers_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(btn_register_supplier)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_suppliers_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))))
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txt_suppliers_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(cmb_suppliers_city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updatee_supplier))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txt_suppliers_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(txt_suppliers_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txt_suppliers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete_supplier)
                        .addGap(20, 20, 20)
                        .addComponent(btn_cancel_supplier)
                        .addGap(49, 49, 49))))
        );

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 300));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Buscar");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 50, 30));
        jPanel8.add(txt_search_suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 205, 30));

        supplier_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Dirección", "Teléfono", "Correo", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(supplier_table);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 920, 110));

        jTabbedPestañas.addTab("Proveedores", jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("ID");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Nombre");

        txt_category_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_category_nameActionPerformed(evt);
            }
        });

        btn_register_category.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register_category.setText("Registrar");

        btn_update_category.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update_category.setText("Modificar");

        btn_delete_category.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete_category.setText("Eliminar");

        btn_cancel_category.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel_category.setText("Cancelar");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_category_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txt_category_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_register_category)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update_category)
                        .addGap(36, 36, 36)
                        .addComponent(btn_delete_category)))
                .addGap(18, 18, 18)
                .addComponent(btn_cancel_category)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 570, 270));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setText("Buscar");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        txt_search_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_categoryActionPerformed(evt);
            }
        });
        jPanel9.add(txt_search_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 165, 30));

        category_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(category_table);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 67, 360, 220));

        jTabbedPestañas.addTab("Categorias", jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_all_purchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Factura de compra", "Proveedor", "Total", "Fecha de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(table_all_purchases);

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 910, 130));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("COMPRAS REALIZADAS");
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("VENTAS REALIZADAS");
        jPanel10.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        table_all_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Factura de compra", "Cliente", "Empleado", "Total", "Fecha de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(table_all_sales);

        jPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 910, 130));

        jTabbedPestañas.addTab("Reportes", jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Identificacion");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Nombre completo");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Dirección");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Teléfono");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Email");

        txt_profile_id.setEditable(false);

        txt_profile_fullname.setEditable(false);

        txt_profile_addres.setEditable(false);

        txt_profile_telephone.setEditable(false);

        txt_profile_email.setEditable(false);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Nueva contraseña");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Confirmar contraseña");

        btn_update_date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_update_date.setText("Modificar");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_profile_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_profile_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_profile_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_profile_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_profile_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(btn_update_date, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txt_password_modify_confirmed, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txt_profile_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(btn_update_date)
                    .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txt_profile_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(txt_password_modify_confirmed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txt_profile_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txt_profile_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txt_profile_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 390));

        jTabbedPestañas.addTab("Perfil", jPanel11);

        getContentPane().add(jTabbedPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void txt_product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_idActionPerformed

    private void btn_register_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_productActionPerformed

    private void btn_update_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_update_productActionPerformed

    private void btn_add_product_topayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_product_topayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_product_topayActionPerformed

    private void btn_new_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_purchaseActionPerformed

    private void txt_purchase_product_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchase_product_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchase_product_codeActionPerformed

    private void txt_purchase_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchase_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchase_idActionPerformed

    private void btn_register_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_customerActionPerformed

    private void txt_search_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_customerActionPerformed

    private void btn_register_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_employeeActionPerformed

    private void txt_search_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_employeeActionPerformed

    private void btn_delete_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_supplierActionPerformed

    private void txt_employee_telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_employee_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_employee_telephoneActionPerformed

    private void txt_search_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_categoryActionPerformed

    private void txt_category_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_category_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_category_nameActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == btn_logout){
            dispose();
            LoginView login = new LoginView();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void cmb_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_rolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_add_product_sale;
    private javax.swing.JButton btn_add_product_topay;
    public javax.swing.JButton btn_cancel_category;
    public javax.swing.JButton btn_cancel_customer;
    public javax.swing.JButton btn_cancel_employee;
    public javax.swing.JButton btn_cancel_product;
    public javax.swing.JButton btn_cancel_supplier;
    private javax.swing.JButton btn_confirm_purchase;
    public javax.swing.JButton btn_confirm_sale;
    public javax.swing.JButton btn_delete_category;
    public javax.swing.JButton btn_delete_customer;
    public javax.swing.JButton btn_delete_employee;
    public javax.swing.JButton btn_delete_product;
    public javax.swing.JButton btn_delete_supplier;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_new_purchase;
    public javax.swing.JButton btn_new_sale;
    public javax.swing.JButton btn_register_category;
    public javax.swing.JButton btn_register_customer;
    public javax.swing.JButton btn_register_employee;
    public javax.swing.JButton btn_register_product;
    public javax.swing.JButton btn_register_supplier;
    private javax.swing.JButton btn_remove_purchase;
    public javax.swing.JButton btn_remove_sale;
    public javax.swing.JButton btn_update_category;
    public javax.swing.JButton btn_update_customer;
    public javax.swing.JButton btn_update_date;
    public javax.swing.JButton btn_update_employee;
    public javax.swing.JButton btn_update_product;
    public javax.swing.JButton btn_updatee_supplier;
    public javax.swing.JTable category_table;
    public javax.swing.JComboBox<Object> cmb_product_category;
    private javax.swing.JComboBox<String> cmb_puchase_supplier;
    public javax.swing.JComboBox<String> cmb_rol;
    public javax.swing.JComboBox<String> cmb_suppliers_city;
    public javax.swing.JTable customer_table;
    public javax.swing.JTable employee_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmplois;
    public javax.swing.JLabel jLabelProduct;
    public javax.swing.JLabel jLabelPurchises;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSales;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategories;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmplois;
    private javax.swing.JPanel jPanelEmployees;
    public javax.swing.JPanel jPanelProduct;
    public javax.swing.JPanel jPanelPurchises;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSales;
    public javax.swing.JPanel jPanelSettings;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPestañas;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JLabel lbl_name_employee;
    public javax.swing.JLabel lbl_name_rol;
    private javax.swing.JLabel logo;
    public javax.swing.JTable products_table;
    private javax.swing.JTable purchases_table;
    public javax.swing.JTable sales_table;
    public javax.swing.JTable supplier_table;
    private javax.swing.JTable table_all_purchases;
    public javax.swing.JTable table_all_sales;
    private javax.swing.JTextField tct_purchase_price;
    public javax.swing.JTextField txt_category_id;
    public javax.swing.JTextField txt_category_name;
    public javax.swing.JTextField txt_customer_addres;
    public javax.swing.JTextField txt_customer_email;
    public javax.swing.JTextField txt_customer_fullname;
    public javax.swing.JTextField txt_customer_id;
    public javax.swing.JTextField txt_customer_telephone;
    public javax.swing.JTextField txt_employee_addres;
    public javax.swing.JTextField txt_employee_email;
    public javax.swing.JTextField txt_employee_fullname;
    public javax.swing.JTextField txt_employee_id;
    public javax.swing.JPasswordField txt_employee_password;
    public javax.swing.JTextField txt_employee_telephone;
    public javax.swing.JTextField txt_employee_username;
    public javax.swing.JPasswordField txt_password_modify;
    public javax.swing.JPasswordField txt_password_modify_confirmed;
    public javax.swing.JTextField txt_product_code;
    public javax.swing.JTextField txt_product_description;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    public javax.swing.JTextField txt_product_unit_price;
    public javax.swing.JTextField txt_profile_addres;
    public javax.swing.JTextField txt_profile_email;
    public javax.swing.JTextField txt_profile_fullname;
    public javax.swing.JTextField txt_profile_id;
    public javax.swing.JTextField txt_profile_telephone;
    private javax.swing.JTextField txt_purchase_amount;
    private javax.swing.JTextField txt_purchase_id;
    private javax.swing.JTextField txt_purchase_product_code;
    private javax.swing.JTextField txt_purchase_subtotal;
    private javax.swing.JTextField txt_purchase_total_topay;
    public javax.swing.JTextField txt_sale_customer_id;
    public javax.swing.JTextField txt_sale_customer_name;
    public javax.swing.JTextField txt_sale_price;
    public javax.swing.JTextField txt_sale_product_code;
    public javax.swing.JTextField txt_sale_product_id;
    public javax.swing.JTextField txt_sale_product_name;
    public javax.swing.JTextField txt_sale_quantity;
    public javax.swing.JTextField txt_sale_stock;
    public javax.swing.JTextField txt_sale_subtotal;
    public javax.swing.JTextField txt_sale_total_to_pay;
    public javax.swing.JTextField txt_search_category;
    public javax.swing.JTextField txt_search_customer;
    public javax.swing.JTextField txt_search_employee;
    public javax.swing.JTextField txt_search_product;
    public javax.swing.JTextField txt_search_suppliers;
    public javax.swing.JTextField txt_suppliers_addres;
    public javax.swing.JTextField txt_suppliers_description;
    public javax.swing.JTextField txt_suppliers_email;
    public javax.swing.JTextField txt_suppliers_id;
    public javax.swing.JTextField txt_suppliers_name;
    public javax.swing.JTextField txt_suppliers_telephone;
    // End of variables declaration//GEN-END:variables
}
