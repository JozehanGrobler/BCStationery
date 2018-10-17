/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BusinessLayerPackage.Category;
import BusinessLayerPackage.Stock;
import java.awt.List;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UpdateStock extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStock
     */
    private Stock currStock;
    public UpdateStock(Stock stock) {
        initComponents();
        currStock=stock;
        //fill dropdown with possible catagories
            //get all catagories
        Category objCategoryHolder = new Category();
        for (Category cat : objCategoryHolder.getCategories()) {
            //fill with all possible names
            cmboCategoryUpd.addItem(cat.getName());
        }
        //fill fields with current stock values
        txtProductNameUpd.setText(currStock.getProductName());
        txtManufacturerUpd.setText(currStock.getManufacturer());
        cmboCategoryUpd.setSelectedItem(currStock.getCategory());
        spnPriceUpd.setValue(currStock.getPrice());
        spnQuantityUpd.setValue(currStock.getQuantity());
    }

    private UpdateStock() {
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

        txtProductNameUpd = new javax.swing.JTextField();
        txtManufacturerUpd = new javax.swing.JTextField();
        cmboCategoryUpd = new javax.swing.JComboBox<>();
        spnQuantityUpd = new javax.swing.JSpinner();
        spnPriceUpd = new javax.swing.JSpinner();
        btnUpdateItem = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 628));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 628));
        getContentPane().setLayout(null);

        txtProductNameUpd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProductNameUpd.setBorder(null);
        getContentPane().add(txtProductNameUpd);
        txtProductNameUpd.setBounds(140, 220, 200, 30);

        txtManufacturerUpd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtManufacturerUpd.setBorder(null);
        getContentPane().add(txtManufacturerUpd);
        txtManufacturerUpd.setBounds(140, 310, 190, 30);

        cmboCategoryUpd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(cmboCategoryUpd);
        cmboCategoryUpd.setBounds(130, 410, 210, 30);

        spnQuantityUpd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(spnQuantityUpd);
        spnQuantityUpd.setBounds(500, 310, 120, 30);

        spnPriceUpd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(spnPriceUpd);
        spnPriceUpd.setBounds(500, 230, 120, 30);

        btnUpdateItem.setBackground(new java.awt.Color(226, 61, 57));
        btnUpdateItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnUpdateItem.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateItem.setText("Update");
        btnUpdateItem.setBorder(null);
        btnUpdateItem.setBorderPainted(false);
        btnUpdateItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateItem);
        btnUpdateItem.setBounds(490, 400, 180, 40);

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
        btnExit.setBounds(760, 10, 30, 30);

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
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimize);
        btnMinimize.setBounds(720, 10, 30, 30);

        btnBack.setBackground(new java.awt.Color(226, 61, 57));
        btnBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(490, 450, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stockUpdate.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
       String prodName =      (txtProductNameUpd.getText());
        String manName =       (txtManufacturerUpd.getText());
        String catagoryName =  (cmboCategoryUpd.getSelectedItem().toString());
        Double prodPrice =     (Double.parseDouble((Integer.toString((int) spnPriceUpd.getValue()))));
        int prodQuantity =  ((int)spnQuantityUpd.getValue());
        ArrayList<String> errors = new ArrayList<>();
        boolean bprodName =      (txtProductNameUpd.getText().isEmpty());
        if(bprodName)errors.add("You cant have the name field empty");
        boolean bmanName =       (txtManufacturerUpd.getText().equals(""));
        if(bmanName)errors.add("You cant have the Manufacturer field empty");
        boolean bcatagoryName =  (cmboCategoryUpd.getSelectedItem().equals(""));
        if(bcatagoryName)errors.add("You cant have the Category Selection empty");
        boolean bprodPrice =     !((int)spnPriceUpd.getValue()>0);
        if(bprodPrice)errors.add("You cant have the Price field empty");
        boolean bprodQuantity =  !((int)spnQuantityUpd.getValue()>0);
        if(bprodQuantity)errors.add("You cant have the Quantity field empty");
        if (!bprodName&&!bmanName&&!bcatagoryName&&!bprodPrice&&!bprodQuantity) {
            //create object of Stock
            //get id sent to form
            
            Stock stock = new Stock(currStock.getStockID(), prodName, manName, catagoryName, prodPrice, prodQuantity, Date.valueOf(LocalDate.now()));
            boolean workDone =stock.updateStock(stock);
            if (workDone) {
                JOptionPane.showMessageDialog(null, "Stock Updated in inventory");
            }else{
                JOptionPane.showMessageDialog(null, "Something went wrong please contact you administrator");
            }
            
            //send object of stock to db
        }else{
            JOptionPane.showMessageDialog(null, errors.get(0), "Please Note", JOptionPane.WARNING_MESSAGE);
           //show error 
           //just keep showing the first error in the ArrayList
           
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Inventory menu = new Inventory();
        menu.setVisible(true);;
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizeActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JComboBox<String> cmboCategoryUpd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner spnPriceUpd;
    private javax.swing.JSpinner spnQuantityUpd;
    private javax.swing.JTextField txtManufacturerUpd;
    private javax.swing.JTextField txtProductNameUpd;
    // End of variables declaration//GEN-END:variables
}
