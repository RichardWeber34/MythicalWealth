/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtCollector;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Rich
 */
public class MythicalWealth extends javax.swing.JFrame {

    /**
     * Creates new form MythicalWealth
     */
    
    Locations Loc = new Locations();
    long sumTot = 0, sumRem = 0;
        
    
    public MythicalWealth() {
        initComponents();
        
        Loc.initLocations();
        
        updateTextAreas();
        //calcOverall();
        
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
        LocATextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        LocBTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        LocCTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        LocDTextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        LocETextArea = new javax.swing.JTextArea();
        LocATot = new javax.swing.JTextField();
        LocBTot = new javax.swing.JTextField();
        LocCTot = new javax.swing.JTextField();
        LocDTot = new javax.swing.JTextField();
        LocETot = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LocARem = new javax.swing.JTextField();
        LocBRem = new javax.swing.JTextField();
        LocDRem = new javax.swing.JTextField();
        LocCRem = new javax.swing.JTextField();
        LocERem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        overallTot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        overallRem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        BufferTextArea = new javax.swing.JTextArea();
        testDataButton = new javax.swing.JButton();
        BufferSelectorCombo = new javax.swing.JComboBox();
        addButton = new javax.swing.JButton();
        suffixCombo = new javax.swing.JComboBox();
        forceAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LocATextArea.setColumns(20);
        LocATextArea.setRows(5);
        jScrollPane1.setViewportView(LocATextArea);

        LocBTextArea.setColumns(20);
        LocBTextArea.setRows(5);
        jScrollPane2.setViewportView(LocBTextArea);

        LocCTextArea.setColumns(20);
        LocCTextArea.setRows(5);
        jScrollPane3.setViewportView(LocCTextArea);

        LocDTextArea.setColumns(20);
        LocDTextArea.setRows(5);
        jScrollPane4.setViewportView(LocDTextArea);

        LocETextArea.setColumns(20);
        LocETextArea.setRows(5);
        jScrollPane5.setViewportView(LocETextArea);

        LocATot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LocBTot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LocCTot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LocDTot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LocETot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Total");

        LocARem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LocBRem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LocBRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocBRemActionPerformed(evt);
            }
        });

        LocDRem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LocDRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocDRemActionPerformed(evt);
            }
        });

        LocCRem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LocCRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocCRemActionPerformed(evt);
            }
        });

        LocERem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LocERem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocERemActionPerformed(evt);
            }
        });

        jLabel2.setText("Remaining");

        overallTot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        overallTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallTotActionPerformed(evt);
            }
        });

        jLabel3.setText("Overall Total");

        overallRem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Overall Remainder");
        jLabel4.setToolTipText("");

        BufferTextArea.setColumns(20);
        BufferTextArea.setRows(5);
        jScrollPane6.setViewportView(BufferTextArea);

        testDataButton.setText("Test Data");
        testDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testDataButtonActionPerformed(evt);
            }
        });

        BufferSelectorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BufferSelectorComboActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        suffixCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E" }));
        suffixCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixComboActionPerformed(evt);
            }
        });

        forceAddButton.setText("Single Swap");
        forceAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forceAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LocARem)
                            .addComponent(LocATot, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocBTot, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocBRem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(overallTot, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(overallRem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(testDataButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LocCTot)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LocDTot)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LocETot, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BufferSelectorCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LocCRem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(LocDRem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(LocERem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(forceAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(suffixCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addButton))))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overallTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(overallRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(testDataButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocATot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocBTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocCTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocDTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocETot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BufferSelectorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocARem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocBRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocCRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocDRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocERem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addButton)
                    .addComponent(suffixCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forceAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocBRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocBRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocBRemActionPerformed

    private void LocDRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocDRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocDRemActionPerformed

    private void LocCRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocCRemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocCRemActionPerformed

    private void LocERemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocERemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocERemActionPerformed

    private void overallTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overallTotActionPerformed

    private void testDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testDataButtonActionPerformed

        Location newL = new Location('Z');
        Loc.Locations[5] = newL;
        
        updateBuffer();
        
    }//GEN-LAST:event_testDataButtonActionPerformed
    private void updateBuffer(){
        BufferTextArea.setText("");
        BufferTextArea.append("Buffer:\n\n");
        String[] strung = Loc.Locations[5].getStorage().listToString(Loc.Locations[5]);
        for(int i = 0; i < strung.length; i++){
            BufferTextArea.append(strung[i]+"\n");
        }
        BufferTextArea.append("\nContains " + Loc.Locations[5].getStorage().getSize() + " Pieces of Art\n"); 
        Loc.Locations[5].calcTotRem();
        
        String[] buffer = Loc.Locations[5].getStorage().listToString(Loc.Locations[5]);
        BufferSelectorCombo.setModel(new javax.swing.DefaultComboBoxModel(buffer));
        
    }
    
    
    private void BufferSelectorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BufferSelectorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BufferSelectorComboActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String line = (String)suffixCombo.getSelectedItem();
        char suffix = line.charAt(0);
        line = (String)BufferSelectorCombo.getSelectedItem();
        
        if(line == null){
            JOptionPane.showMessageDialog(null, "There are no items to be added"); 
            return;
        }
        
        String[] piece = line.split(", ");
        ArtPiece aPiece = new ArtPiece(piece);
        int i = Loc.searchSuffix(suffix);
        
        Node n = Loc.Locations[5].getStorage().seqSearchItem(Integer.parseInt(piece[0]));
        if(n != null){
            if(Loc.Locations[5].checkSpace(aPiece, Loc.Locations[i])){
                Loc.Locations[5].getStorage().setFocus(n);
                Loc.Locations[5].getStorage().removeFocus();  
                Loc.Locations[i].getStorage().addNodeByVal(n);
                updateTextAreas();
                updateBuffer();   
                
            }else{
                JOptionPane.showMessageDialog(null, "Item does not fit");
                int reply = JOptionPane.showConfirmDialog(null, "Would you like to move an item to make space?", Loc.Locations[i].getName(), JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                //run function    
                }
                else {
                    return;
                }
            }
            
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void suffixComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suffixComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suffixComboActionPerformed

    private void forceAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forceAddButtonActionPerformed
        String line = (String)suffixCombo.getSelectedItem();
        char suffix = line.charAt(0);
        line = (String)BufferSelectorCombo.getSelectedItem();
        
        if(line == null){
            JOptionPane.showMessageDialog(null, "There are no items to be added"); 
            return;
        }
        String[] piece = line.split(", ");
        int i = Loc.searchSuffix(suffix);
        
        Node P = Loc.Locations[5].getStorage().seqSearchItem(Integer.parseInt(piece[0]));
        
        Node N = Loc.Locations[i].getStorage().seqSearchVal(P);
        
        N = Loc.Locations[i].getStorage().swapPieces(P, N);
        
        Loc.Locations[5].getStorage().addNodeByVal(N);
    
    }//GEN-LAST:event_forceAddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MythicalWealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MythicalWealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MythicalWealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MythicalWealth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MythicalWealth().setVisible(true);
                
                
                        
            }
        });
    }
    
    public void updateA(){
        LocATextArea.setText("");
        String[] strung;
        
        LocATextArea.append("Location A:\n\n");
        strung = Loc.Locations[0].getStorage().listToString(Loc.Locations[0]);
        for (String strung1 : strung) {
            LocATextArea.append(strung1 + "\n");
        }
        Loc.Locations[0].calcTotRem();
      
        LocATextArea.append("\nContains " + Loc.Locations[0].getStorage().getSize() + " Pieces of Art\n");       
        LocATot.setText("£" + Loc.Locations[0].getTotal());
        LocARem.setText("£" + Loc.Locations[0].getRemainder());
        
    }
    
    public void updateB(){
        LocBTextArea.setText("");
        String[] strung;
        
        LocBTextArea.append("Location B:\n\n");
        strung = Loc.Locations[1].getStorage().listToString(Loc.Locations[1]);
        for (String strung1 : strung) {
            LocBTextArea.append(strung1 + "\n");
        }
        Loc.Locations[1].calcTotRem();
        
        LocBTextArea.append("\nContains " + Loc.Locations[1].getStorage().getSize() + " Pieces of Art\n");       
        LocBTot.setText("£" + Loc.Locations[1].getTotal());
        LocBRem.setText("£" + Loc.Locations[1].getRemainder());
    }
    
    public void updateC(){
        LocCTextArea.setText("");
        String[] strung;
        
        LocCTextArea.append("Location C:\n\n");
        strung = Loc.Locations[2].getStorage().listToString(Loc.Locations[2]);
        for (String strung1 : strung) {
            LocCTextArea.append(strung1 + "\n");
        }
        Loc.Locations[2].calcTotRem();
        
        LocCTextArea.append("\nContains " + Loc.Locations[2].getStorage().getSize() + " Pieces of Art\n");       
        LocCTot.setText("£" + Loc.Locations[2].getTotal());
        LocCRem.setText("£" + Loc.Locations[2].getRemainder());
        updateTotals();
    }    
    
    public void updateD(){
        LocDTextArea.setText("");
        String[] strung;
        
        LocDTextArea.append("Location D:\n\n");
        strung = Loc.Locations[3].getStorage().listToString(Loc.Locations[3]);
        for (String strung1 : strung) {
            LocDTextArea.append(strung1 + "\n");
        }
        Loc.Locations[3].calcTotRem();
        
        LocDTextArea.append("\nContains " + Loc.Locations[3].getStorage().getSize() + " Pieces of Art\n");       
        LocDTot.setText("£" + Loc.Locations[3].getTotal());
        LocDRem.setText("£" + Loc.Locations[3].getRemainder());
        
        updateTotals();
    }
    
    
    public void updateE(){
        LocETextArea.setText("");
        String[] strung;
        
        LocETextArea.append("Location E:\n\n");
        strung = Loc.Locations[4].getStorage().listToString(Loc.Locations[4]);
        for (String strung1 : strung) {
            LocETextArea.append(strung1 + "\n");
        }
        Loc.Locations[4].calcTotRem();
        
        LocETextArea.append("\nContains " + Loc.Locations[4].getStorage().getSize() + " Pieces of Art\n");       
        LocETot.setText("£" + Loc.Locations[4].getTotal());
        LocERem.setText("£" + Loc.Locations[4].getRemainder());
        
        updateTotals();
    }        
    
    public void updateTextAreas(){
        
        updateA();
        updateB();
        updateC();
        updateD();
        updateE();
        
        
    }
        
    
        
        

        
//    
    
//    
//    public void moveAllToBuffer(){
//        Iterator it;
//        ArtPiece A;
//        for(int i = 0; i < 5; i++){
//            it = lArray[i].storage.iterator();
//            for (int j = 0; j < 5; j++){
//                 A = lArray[i].storage.get(j);
//                 
//            }
//            
//            
//        }
//        
//    }
    

    
    public void updateTotals(){
        
        for(int i = 0; i < 5; i++){
            sumTot += Loc.Locations[i].getTotal();
            sumRem += Loc.Locations[i].getRemainder();
        }
        overallTot.setText("£"+sumTot);
        overallRem.setText("£"+sumRem);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BufferSelectorCombo;
    private javax.swing.JTextArea BufferTextArea;
    private javax.swing.JTextField LocARem;
    private javax.swing.JTextArea LocATextArea;
    private javax.swing.JTextField LocATot;
    private javax.swing.JTextField LocBRem;
    private javax.swing.JTextArea LocBTextArea;
    private javax.swing.JTextField LocBTot;
    private javax.swing.JTextField LocCRem;
    private javax.swing.JTextArea LocCTextArea;
    private javax.swing.JTextField LocCTot;
    private javax.swing.JTextField LocDRem;
    private javax.swing.JTextArea LocDTextArea;
    private javax.swing.JTextField LocDTot;
    private javax.swing.JTextField LocERem;
    private javax.swing.JTextArea LocETextArea;
    private javax.swing.JTextField LocETot;
    private javax.swing.JButton addButton;
    private javax.swing.JButton forceAddButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField overallRem;
    private javax.swing.JTextField overallTot;
    private javax.swing.JComboBox suffixCombo;
    private javax.swing.JButton testDataButton;
    // End of variables declaration//GEN-END:variables
}