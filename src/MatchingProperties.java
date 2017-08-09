
import Classes.PropertiesArray;
import java.util.Scanner;

public class MatchingProperties extends javax.swing.JFrame {
    PropertiesArray propertiesArray = new PropertiesArray("TemporaryProperties.txt");
    public MatchingProperties() {
   
    
        initComponents();
        for (int i = 0; i < propertiesArray.getSize(); i++) {
            tblProperties.getModel().setValueAt(propertiesArray.arrProp[i].getStreetName(), i, 0);
            tblProperties.getModel().setValueAt(propertiesArray.arrProp[i].getArea(), i, 1);
            tblProperties.getModel().setValueAt(propertiesArray.arrProp[i].getNumBeds(), i, 2);
            tblProperties.getModel().setValueAt(propertiesArray.arrProp[i].getNumBaths(), i, 3);
            tblProperties.getModel().setValueAt(propertiesArray.arrProp[i].getPrice(), i, 4);




        }
    }
                
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPropertiesThatMatchSearch = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProperties = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPropertiesThatMatchSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPropertiesThatMatchSearch.setText("Properties that match your search");

        jButton1.setText("Back");
        jButton1.setName("btnBack"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack(evt);
            }
        });

        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp(evt);
            }
        });

        tblProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Street Name", "Area", "Bedrooms", "Bathrooms", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblProperties);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPropertiesThatMatchSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPropertiesThatMatchSearch)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack
        this.dispose();
        new Search().setVisible(true);
    }//GEN-LAST:event_btnBack

    private void btnHelp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelp

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchingProperties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPropertiesThatMatchSearch;
    private javax.swing.JTable tblProperties;
    // End of variables declaration//GEN-END:variables
}
