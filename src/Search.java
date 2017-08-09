
import Classes.PropertiesArray;
import Classes.SellersArray;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Search extends javax.swing.JFrame {

    SellersArray sellersArray = new SellersArray();
    PropertiesArray propertiesArray = new PropertiesArray("Properties.txt");

    public Search() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spnrBedrooms = new javax.swing.JSpinner();
        spnrBathrooms = new javax.swing.JSpinner();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbPriceRange = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Search For Properties");

        jLabel4.setText("Number of Bedrooms");

        jLabel5.setText("Number of Bathrooms");

        jToggleButton1.setText("?");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Price Range ");

        cmbPriceRange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "0 - 500 000", "500 000 - 1 000 000", "1 000 000 - 1 500 000", "1 500 000 - 2 000 000", "2 000 000 - 3 000 000", "3 000 000 - 4 000 000", "4 000 000 - 5 000 000", "> 5 000 000" }));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Area");

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Aldara Park", "Blairgowrie", "Bordeaux", "Boskruin", "Bromhof", "Cresta", "Darrenwood", "Fairlands", "Ferndale", "Jukskei Park", "Kensington 'B'", "Malanshof", "Northriding", "Olivedale", "Randpark Ridge", "Robin Hills", "Roosevelt Park", "Windsor East", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)
                                .addComponent(jToggleButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(spnrBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnrBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPriceRange, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbPriceRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(spnrBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnBack))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new MainScreen().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed


        for (int i = 0; i < propertiesArray.getSize(); i++) {

            if (cmbArea.getName().equals(propertiesArray.arrProp[i].getArea())) {
                if (cmbPriceRange.getName().equals("Any")) {
                    if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporaryProperties.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                } else 
                    if (cmbPriceRange.getName().equals("0 - 500 000") && propertiesArray.arrProp[i].getPrice() > 0 && propertiesArray.arrProp[i].getPrice() < 500 000)
                {
                    try {
                        propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }               
                else 
                    if (cmbPriceRange.getName().equals("500 000 - 1 000 000") && propertiesArray.arrProp[i].getPrice() >= 500 000 && propertiesArray.arrProp[i].getPrice() < 1 000 000)
                    {
                        if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }

                        }
                    }
                    }
                    else 
                    if (cmbPriceRange.getName().equals("1 000 000 - 1 500 000") && propertiesArray.arrProp[i].getPrice() >= 1 000 000 && propertiesArray.arrProp[i].getPrice() < 1 500 000)
                    {
                        if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                    }
                    else 
                    if (cmbPriceRange.getName().equals("1 500 000 - 2 000 000") && propertiesArray.arrProp[i].getPrice() >= 1 500 000 && propertiesArray.arrProp[i].getPrice() < 2 000 000)
                    {
                        if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                    }
                    else 
                    if (cmbPriceRange.getName().equals("2 000 000 - 3 000 000") && propertiesArray.arrProp[i].getPrice() >= 2 000 000 && propertiesArray.arrProp[i].getPrice() < 3 000 000)
                    {
                        if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                    }
                    else 
                    if (cmbPriceRange.getName().equals("3 000 000 - 4 000 000") && propertiesArray.arrProp[i].getPrice() >= 3 000 000 && propertiesArray.arrProp[i].getPrice() < 4000 000)
                    {
                        if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                    }else 
                    if (cmbPriceRange.getName().equals("4 000 000 - 5 000 000") && propertiesArray.arrProp[i].getPrice() >= 4 000 000 && propertiesArray.arrProp[i].getPrice() < 5 000 000)
                    {
                        if (spnrBedrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBeds()) {
                        if (spnrBathrooms.getComponentCount() == propertiesArray.arrProp[i].getNumBaths()) {
                            try {
                                propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                    }
                    else 
                    if (cmbPriceRange.getName().equals(">5 000 000") && propertiesArray.arrProp[i].getPrice() > 5 000 000)
                    {
                try {
                    propertiesArray.writeDetailsToFile("TemporarySearchResults.txt", propertiesArray.arrProp[i].getStreetNum(), propertiesArray.arrProp[i].getStreetName(), propertiesArray.arrProp[i].getArea(), propertiesArray.arrProp[i].getNumBeds(), propertiesArray.arrProp[i].getNumBaths(), propertiesArray.arrProp[i].getPrice(), propertiesArray.arrProp[i].getSellerID());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                }

                    }
                
                
            }
            
            
            
            
        )

            {
            
        case "Aldara Park":
        
    case "Blairgowrie":
    case "Bordeaux":
    case "Boskruin":
    case "Bromhof":
    case "Cresta":
    case "Darrenwood":
    case "Fairlands":
    case "Ferndale":
    case "Jukskei Park":
    case "Kensington 'B'":
    case "Malanshof":
    case "Northriding":
    case "Northwold":
    case "Olivedale":
    case "Randpark Ridge":
    case "Robin Hills":
    case "Roosevelt Park":
    case "Windsor East":
}
    
//        if (cmbPriceRange.getName().equals("Any")) {
//            MatchingProperties matchingProperties = new MatchingProperties();
//            matchingProperties.setVisible(true);

        
    }//GEN-LAST:event_btnSearchActionPerformed

    

    

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JComboBox<String> cmbPriceRange;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JSpinner spnrBathrooms;
    private javax.swing.JSpinner spnrBedrooms;
    // End of variables declaration//GEN-END:variables
}
