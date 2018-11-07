/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
//t
import BusinessLayerPackage.Admin;
import BusinessLayerPackage.BCSerializer;
import BusinessLayerPackage.Reporter;
import BusinessLayerPackage.Stock;
import BusinessLayerPackage.purchaseOrder;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    public Inventory() {
        initComponents();
        Stock objStockHolder = new Stock();
        allStock = objStockHolder.getStock();
        populateTable(allStock);
        //event listener for sorting on column headers
        JTableHeader header = tblInventory.getTableHeader();
        //using built in function
        tblInventory.setAutoCreateRowSorter(true);


    }
    private ArrayList<Stock> allStock;

    private void populateTable(ArrayList<Stock> stockList) {

        DefaultTableModel dmodel = (DefaultTableModel) tblInventory.getModel();
        Object[] row = new Object[5];
        //clearTable
        dmodel.setRowCount(0);
        if (stockList.size() > 0) {
            for (Stock stc : stockList) {
                row[0] = stc.getProductName();
                row[1] = stc.getManufacturer();
                row[2] = stc.getCategory();
                row[3] = stc.getPrice();
                row[4] = stc.getQuantity();
                dmodel.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is no Data that matches your search result", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchCriteriaGroup = new javax.swing.ButtonGroup();
        btnViewAllStock = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();
        btnAddStock = new javax.swing.JButton();
        txtSearchStock = new javax.swing.JTextField();
        btnSearchStock = new javax.swing.JButton();
        rbProdName = new javax.swing.JRadioButton();
        rbCategory = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnBackLogout = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        frameMove = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1028, 637));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btnViewAllStock.setBackground(new java.awt.Color(254, 212, 29));
        btnViewAllStock.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnViewAllStock.setText("View All");
        btnViewAllStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 212, 29), 1, true));
        btnViewAllStock.setBorderPainted(false);
        btnViewAllStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAllStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewAllStock);
        btnViewAllStock.setBounds(130, 160, 109, 31);

        btnGenerateReport.setBackground(new java.awt.Color(254, 212, 29));
        btnGenerateReport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.setBorderPainted(false);
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerateReport);
        btnGenerateReport.setBounds(760, 530, 170, 30);

        btnAddStock.setBackground(new java.awt.Color(254, 212, 29));
        btnAddStock.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.setBorder(null);
        btnAddStock.setBorderPainted(false);
        btnAddStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStock);
        btnAddStock.setBounds(260, 160, 102, 31);

        txtSearchStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtSearchStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStockActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearchStock);
        txtSearchStock.setBounds(660, 160, 202, 36);

        btnSearchStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        btnSearchStock.setBorderPainted(false);
        btnSearchStock.setContentAreaFilled(false);
        btnSearchStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchStock);
        btnSearchStock.setBounds(880, 140, 46, 49);

        rbProdName.setBackground(new java.awt.Color(255, 255, 255));
        SearchCriteriaGroup.add(rbProdName);
        rbProdName.setText("Product Name");
        getContentPane().add(rbProdName);
        rbProdName.setBounds(530, 150, 120, 23);

        rbCategory.setBackground(new java.awt.Color(255, 255, 255));
        SearchCriteriaGroup.add(rbCategory);
        rbCategory.setText("Category");
        getContentPane().add(rbCategory);
        rbCategory.setBounds(530, 180, 120, 23);

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductName", "Manufacturer", "Category", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInventory.setColumnSelectionAllowed(true);
        tblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventoryMouseClicked(evt);
            }
        });
        tblInventory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblInventoryKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventory);
        tblInventory.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(1).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
            tblInventory.getColumnModel().getColumn(3).setResizable(false);
            tblInventory.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 220, 832, 310);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        btnExit.setToolTipText("Exit");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(980, 10, 50, 30);

        btnBackLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnBackLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        btnBackLogout.setToolTipText("Back");
        btnBackLogout.setBorder(null);
        btnBackLogout.setBorderPainted(false);
        btnBackLogout.setContentAreaFilled(false);
        btnBackLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackLogoutMouseClicked(evt);
            }
        });
        btnBackLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackLogout);
        btnBackLogout.setBounds(950, 10, 31, 31);

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        btnMinimize.setToolTipText("Minimize");
        btnMinimize.setBorder(null);
        btnMinimize.setBorderPainted(false);
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(btnMinimize);
        btnMinimize.setBounds(910, 10, 31, 31);

        frameMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameMoveMouseDragged(evt);
            }
        });
        frameMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameMoveMousePressed(evt);
            }
        });
        getContentPane().add(frameMove);
        frameMove.setBounds(4, 0, 900, 40);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InventoryBG.png"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1030, 637);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        AddStock addStock = new AddStock();
        addStock.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Please Note", JOptionPane.INFORMATION_MESSAGE);
        if (selection == JOptionPane.YES_OPTION) {
            Admin.UpdateAdminLoggedIn(AdminLogin.activeUser, 0);
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnBackLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackLogoutMouseClicked

    private void btnBackLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLogoutActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);;
        this.dispose();
    }//GEN-LAST:event_btnBackLogoutActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void txtSearchStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStockActionPerformed

    private void btnSearchStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStockActionPerformed
        //Iterate and search for specific stock
        String input = txtSearchStock.getText();

        ArrayList<Stock> newListStock = new ArrayList<Stock>();
        if (!input.isEmpty()) {
            String inputCapital = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
            if (rbProdName.isSelected()) {
                for (Stock stock : allStock) {
                    if ((stock.getProductName().contains(inputCapital))) {
                        newListStock.add(stock);
                    }
                }
                populateTable(newListStock);
            } else if (rbCategory.isSelected()) {
                for (Stock stock : allStock) {
                    if (stock.getCategory().contains(inputCapital)) {
                        newListStock.add(stock);
                    }
                }
                populateTable(newListStock);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Search Criteria");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a keyword for the search", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchStockActionPerformed

    private void btnViewAllStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllStockActionPerformed
        populateTable(allStock);
    }//GEN-LAST:event_btnViewAllStockActionPerformed

    private void tblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventoryMouseClicked
        //Get selected value
        //Send object to update form.
        DefaultTableModel dmodel = (DefaultTableModel) tblInventory.getModel();
        Stock curStock = new Stock();
        String CurrentPName = ((String) tblInventory.getValueAt(tblInventory.getSelectedRow(), 0));
        int selection = JOptionPane.showConfirmDialog(null, "Do you want to update " + CurrentPName,
                "Please Note", JOptionPane.INFORMATION_MESSAGE);
        if (selection == JOptionPane.YES_OPTION) {
            for (Stock stock : allStock) {
                if (stock.getProductName().equals(CurrentPName)) {
                    curStock = stock;
                }
            }
            //new update page object
            UpdateStock newUpdateStock = new UpdateStock(curStock);
            newUpdateStock.setVisible(true);;
            this.dispose();
        }
    }//GEN-LAST:event_tblInventoryMouseClicked

    private void tblInventoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInventoryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInventoryKeyPressed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        //Get current inventory
        //allStock;
        //get current purchase orders
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
        Date d = new Date();
        String output =String.format(
                "=================================================================================================\n"
              + "           STOCK REPORT            "+sdf.format(d)+"                                                   =\n"
              + "=================================================================================================\n"
              + "The following table shows all the stock currently in the Inventory:\n"
              + "________________________________________________________________________________________________\n"
              + "|%5s|%21s|%13s|%21s|%10s|%8s|%10s|\n"
              + "________________________________________________________________________________________________\n"
                ,"ID","Name","Manufacturer","Category","Price","Quantity","Entry Date");
        
        for (Stock stock : allStock) {
            output+=(stock.toString())+"\n";
        }
        output+=String.format("________________________________________________________________________________________________\n"
                            + "\n"
                            + "The following table shows the Purchase Order items that needs to be Purchased: \n"
                            + "_______________________________________________________________________________\n"
                            + "|%5s|%21s|%13s|%10s|%8s|%15s|\n"
                            + "_______________________________________________________________________________\n"
                            ,"ID","Name","Manufacturer","Price","Quantity","Quantity needed"
                            );
        //get all purchase orders
        purchaseOrder po = new purchaseOrder();
        ArrayList<purchaseOrder> pOrders = po.getPurchaseOrders();
        for (purchaseOrder pOrder : pOrders) {
            for (Stock stock : allStock) {
                if (stock.getStockID()==pOrder.getStockID()) {
                    output+= pOrder.showPurchaseOrder(stock);
                }
            }
        }
        output+="_______________________________________________________________________________\n";
        
        
        // make pretty report
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
        f.showSaveDialog(null);
        String directory = (String)(f.getCurrentDirectory()).getPath();
        directory+="\\CurrentInventoryReport";
        Reporter rep = new Reporter(output);
        BCSerializer ser = new BCSerializer(output);
        rep.saveReport(directory);
        //ser.Serialize(directory);
        // export ass xml
        // export as serialised
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    int xMouse;
    int yMouse;
    private void frameMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameMoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_frameMoveMouseDragged

    private void frameMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameMoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameMoveMousePressed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.ButtonGroup SearchCriteriaGroup;
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnBackLogout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnSearchStock;
    private javax.swing.JButton btnViewAllStock;
    private javax.swing.JLabel frameMove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCategory;
    private javax.swing.JRadioButton rbProdName;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtSearchStock;
    // End of variables declaration//GEN-END:variables
}
