/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
//t

import BusinessLayerPackage.Admin;
import BusinessLayerPackage.IAdmin;
import BusinessLayerPackage.IRequestDetails;
import BusinessLayerPackage.IStock;
import BusinessLayerPackage.RequestDetails;
import BusinessLayerPackage.StaffRequest;
import BusinessLayerPackage.Messages;
import BusinessLayerPackage.SingleRegistry;
import BusinessLayerPackage.Stock;
import BusinessLayerPackage.purchaseOrder;
import DataAccessLayerPackage.MessageHandler;
import DataAccessLayerPackage.StaffRequestHandler;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AdminOrderCompletion extends javax.swing.JFrame {

    /**
     * Creates new form AdminOrderCompletion
     */
    public AdminOrderCompletion(StaffRequest rec) {
        try {
            initComponents();
            IRequestDetails rDetailsImp = (IRequestDetails) SingleRegistry.getInstance().getRegistry().lookup("rDetails");
            ArrayList<RequestDetails> detailsPackage = rDetailsImp.getRequestDetails(StaffRequestHandler.requestType.Incomplete, rec.getStaffID(), rec.getRequestNr());
            currentRequest = rec;
            populateTable(detailsPackage);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private StaffRequest currentRequest = new StaffRequest();
    private ArrayList<Stock> outOfStock = new ArrayList<>();

    private void populateTable(ArrayList<RequestDetails> requestList) {

        try {
            DefaultTableModel dmodel = (DefaultTableModel) tblRequestItems.getModel();
            Object[] row = new Object[7];
            //clearTable
            dmodel.setRowCount(0);
            IStock stockImp = (IStock) SingleRegistry.getInstance().getRegistry().lookup("stock");
            ArrayList<Stock> inventory = stockImp.getStock();
            if (requestList.size() > 0) {
                for (RequestDetails stc : requestList) {
                    row[0] = stc.getStockID();
                    row[1] = stc.getProductName();
                    row[2] = stc.getManufacturer();
                    row[3] = stc.getCategory();
                    row[4] = stc.getQuantity();
                    int qty = 0;
                    for (Stock ss : inventory) {
                        if (ss.getStockID() == stc.getStockID()) {
                            row[5] = ss.getQuantity();
                            qty = ss.getQuantity();
                            if (qty < stc.getQuantity()) {
                                row[6] = "Not Enough Stock";
                                outOfStock.add(ss);
                            } else {
                                row[6] = "In Stock";
                            }
                        }
                    }
                    
                    dmodel.addRow(row);
                }
            } else {
                //set current order package to complete
                StaffRequest sr = new StaffRequest();
                sr.updateState(StaffRequestHandler.stateType.Complete, currentRequest.getRequestNr());
                JOptionPane.showMessageDialog(null, "There is no Data that matches your search result", "Attention", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private AdminOrderCompletion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestItems = new javax.swing.JTable();
        btnBackLogout = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        frameMove = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1029, 637));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tblRequestItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product", "Manufacturer", "Category", "Quantity", "Qty In Stock", "Meet Requirements"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequestItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRequestItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRequestItems);
        if (tblRequestItems.getColumnModel().getColumnCount() > 0) {
            tblRequestItems.getColumnModel().getColumn(0).setResizable(false);
            tblRequestItems.getColumnModel().getColumn(1).setResizable(false);
            tblRequestItems.getColumnModel().getColumn(2).setResizable(false);
            tblRequestItems.getColumnModel().getColumn(3).setResizable(false);
            tblRequestItems.getColumnModel().getColumn(4).setResizable(false);
            tblRequestItems.getColumnModel().getColumn(5).setResizable(false);
            tblRequestItems.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 160, 820, 370);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/orderItemsAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 637);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackLogoutMouseClicked

    private void btnBackLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLogoutActionPerformed
        try {
            AdminOrders orders = new AdminOrders();
            orders.setVisible(true);
            this.dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackLogoutActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Please Note", JOptionPane.INFORMATION_MESSAGE);
        if (selection == JOptionPane.YES_OPTION) {
            try {
                IAdmin adminImp = (IAdmin) SingleRegistry.getInstance().getRegistry().lookup("admin");
                adminImp.UpdateAdminLoggedIn(AdminLogin.activeUser, 0);
                System.exit(0);
            } catch (NotBoundException ex) {
                Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnExitMouseClicked

    private void tblRequestItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestItemsMouseClicked
        //check quantities   
        int currentItemId = (int) tblRequestItems.getValueAt(tblRequestItems.getSelectedRow(), 0);
        int InventoryQty = (int) tblRequestItems.getValueAt(tblRequestItems.getSelectedRow(), 5);
        int requestedQty = (int) tblRequestItems.getValueAt(tblRequestItems.getSelectedRow(), 4);
        if (InventoryQty < requestedQty) {
            //if not send purchase order
            int selection = JOptionPane.showConfirmDialog(null, "You do not meet requirements, do you want to send purchase order",
                    "Please Note", JOptionPane.INFORMATION_MESSAGE);
            if (selection == JOptionPane.YES_OPTION) {
                try {
                    IRequestDetails rDetailsImp = (IRequestDetails) SingleRegistry.getInstance().getRegistry().lookup("rDetails");
                    ArrayList<RequestDetails> detailsPackage = rDetailsImp.getRequestDetails(StaffRequestHandler.requestType.Incomplete, currentRequest.getStaffID(), currentRequest.getRequestNr());
                    List<Integer> lID = detailsPackage.stream().map(requestdetails -> requestdetails.getStockID()).collect(Collectors.toList());
                    if (lID.contains(currentItemId)) {
                        try {
                            purchaseOrder po = new purchaseOrder();
                            po.setStockID(currentItemId);
                            po.insert(requestedQty - InventoryQty);
                            //TODO
                            //check if item is still in db
                            Messages.InsertStaffMessages(MessageHandler.Message.inventory, AdminOrders.staffUsernameRequest);
                            JOptionPane.showMessageDialog(rootPane, "Purchase Order is sent");
                            detailsPackage = rDetailsImp.getRequestDetails(StaffRequestHandler.requestType.Incomplete, currentRequest.getStaffID(), currentRequest.getRequestNr());
                            populateTable(detailsPackage);
                        } catch (RemoteException ex) {
                            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (NotBoundException ex) {
                            Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "The item is no longer requested");
                    }
                } catch (RemoteException ex) {
                    Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NotBoundException ex) {
                    Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else if (InventoryQty >= requestedQty) {
            int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to complete transaction ",
                    "Please Note", JOptionPane.INFORMATION_MESSAGE);
            if (selection == JOptionPane.YES_OPTION) {

                try {
                    //if in stock dilver items
                    IRequestDetails rDetailsImp = (IRequestDetails) SingleRegistry.getInstance().getRegistry().lookup("rDetails");
                    //getting all requested items--final check if user did not remove the items
                    ArrayList<RequestDetails> detailsPackage = rDetailsImp.getRequestDetails(StaffRequestHandler.requestType.Incomplete, currentRequest.getStaffID(), currentRequest.getRequestNr());
                    int RequestDetailsID = 0;
                    Stock stockHolder = new Stock();
                    for (RequestDetails rdp : detailsPackage) {
                        if (currentItemId == rdp.getStockID()) {
                            try {
                                RequestDetails.CompleteTransaction(rdp.getRequestDetailsID(), 1, Date.valueOf(LocalDate.now()));
                                stockHolder.removeStock(rdp.getStockID(), rdp.getQuantity());
                                Messages.InsertStaffMessages(MessageHandler.Message.requestComplete, AdminOrders.staffUsernameRequest);
                            } catch (RemoteException ex) {
                                Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (NotBoundException ex) {
                                Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    detailsPackage = rDetailsImp.getRequestDetails(StaffRequestHandler.requestType.Incomplete, currentRequest.getStaffID(), currentRequest.getRequestNr());
                    populateTable(detailsPackage);
                } catch (NotBoundException ex) {
                    Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RemoteException ex) {
                    Logger.getLogger(AdminOrderCompletion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tblRequestItemsMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminOrderCompletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOrderCompletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOrderCompletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOrderCompletion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOrderCompletion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackLogout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel frameMove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestItems;
    // End of variables declaration//GEN-END:variables
}
