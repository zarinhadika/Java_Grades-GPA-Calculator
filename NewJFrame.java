/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New Dynamic
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        historyTF = new javax.swing.JTextField();
        englishTF = new javax.swing.JTextField();
        mathTF = new javax.swing.JTextField();
        physicsTF = new javax.swing.JTextField();
        biologyTF = new javax.swing.JTextField();
        hLetterTF = new javax.swing.JTextField();
        eLetterTF = new javax.swing.JTextField();
        mLetterTF = new javax.swing.JTextField();
        pLetterTF = new javax.swing.JTextField();
        bLetterTF = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        gpaTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("JAVA Grades");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("History:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("English:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("   Math:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Physics:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Biology:");

        historyTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        englishTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        mathTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mathTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathTFActionPerformed(evt);
            }
        });

        physicsTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        biologyTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        hLetterTF.setEditable(false);
        hLetterTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        eLetterTF.setEditable(false);
        eLetterTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        mLetterTF.setEditable(false);
        mLetterTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mLetterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLetterTFActionPerformed(evt);
            }
        });

        pLetterTF.setEditable(false);
        pLetterTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pLetterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pLetterTFActionPerformed(evt);
            }
        });

        bLetterTF.setEditable(false);
        bLetterTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        gpaTF.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gpaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("GPA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Average");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Letter Grade");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(biologyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(mathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(physicsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(hLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(englishTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(eLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(59, 59, 59))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(96, 96, 96))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(gpaTF))
                                        .addGap(76, 76, 76))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(historyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel9))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpaTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(historyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(englishTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(physicsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(biologyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bLetterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mLetterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLetterTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mLetterTFActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void pLetterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pLetterTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pLetterTFActionPerformed

    private void mathTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mathTFActionPerformed

    private void gpaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Calculate Button
        
       String historyScore,englishScore,physicsScore,biologyScore,mathScore;
       double average;
       double gpa=0;
       historyScore=historyTF.getText();
       englishScore=englishTF.getText();
       physicsScore=physicsTF.getText();
       biologyScore=biologyTF.getText();
       mathScore=mathTF.getText();
       double history=Double.parseDouble(historyScore);
       double english=Double.parseDouble(englishScore);
       double math=Double.parseDouble(mathScore);
       double biology=Double.parseDouble(biologyScore);
       double physics=Double.parseDouble(physicsScore);
       average=(history+english+biology+math+physics)/5;
       String showAverage=String.format("%.1f",average);
       jTextField11.setText(showAverage);
      if(history>=90)
      {
          hLetterTF.setText("A");
          gpa=gpa+4.0;
          
      }
      else if(history>=80 && history<90)
      {
          hLetterTF.setText("B");
          gpa=gpa+3.0;
      }
      else if(history>=70 && history<80)
      {
          hLetterTF.setText("C");
          gpa=gpa+2.0;
      }
      else if(history>=60 && history<70)
      {
          hLetterTF.setText("D");
          gpa=gpa+1.0;
      }
      else
      {
          hLetterTF.setText("F");
          gpa=gpa+0.0;
      }
      //math
      if(math>=90)
      {
        mLetterTF.setText("A");
          gpa=gpa+4.0;
          
      }
      else if(math>=80 && math<90)
      {
          mLetterTF.setText("B");
          gpa=gpa+3.0;
      }
      else if(math>=70 && math<80)
      {
          mLetterTF.setText("C");
          gpa=gpa+2.0;
      }
      else if(math>=60 && math<70)
      {
        mLetterTF.setText("D");
          gpa=gpa+1.0;
      }
      else
      {
          mLetterTF.setText("F");
          gpa=gpa+0.0;
      }
      //biology
      if(biology>=90)
      {
          bLetterTF.setText("A");
          gpa=gpa+4.0;
          
      }
      else if(biology>=80 && biology<90)
      {
         bLetterTF.setText("B");
          gpa=gpa+3.0;
      }
      else if(biology>=70 && biology<80)
      {
          bLetterTF.setText("C");
          gpa=gpa+2.0;
      }
      else if(biology>=60 && biology<70)
      {
          bLetterTF.setText("D");
          gpa=gpa+1.0;
      }
      else
      {
          bLetterTF.setText("F");
          gpa=gpa+0.0;
      }
      //physics
      if(physics>=90)
      {
          pLetterTF.setText("A");
          gpa=gpa+4.0;
          
      }
      else if(physics>=80 && physics<90)
      {
          pLetterTF.setText("B");
          gpa=gpa+3.0;
      }
      else if(physics>=70 && physics<80)
      {
          pLetterTF.setText("C");
          gpa=gpa+2.0;
      }
      else if(physics>=60 && physics<70)
      {
          pLetterTF.setText("D");
          gpa=gpa+1.0;
      }
      else
      {
        pLetterTF.setText("F");
          gpa=gpa+0.0;
      }
      //english
      if(english>=90)
      {
          eLetterTF.setText("A");
          gpa=gpa+4.0;
          
      }
      else if(english>=80 && english<90)
      {
         eLetterTF.setText("B");
          gpa=gpa+3.0;
      }
      else if(english>=70 && english<80)
      {
          eLetterTF.setText("C");
          gpa=gpa+2.0;
      }
      else if(english>=60 && english<70)
      {
          eLetterTF.setText("D");
          gpa=gpa+1.0;
      }
      else
      {
          eLetterTF.setText("F");
          gpa=gpa+0.0;
      }
      gpa=gpa/5;
      String cal_gpa=String.format("%.1f",gpa);
      gpaTF.setText(cal_gpa);
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bLetterTF;
    private javax.swing.JTextField biologyTF;
    private javax.swing.JTextField eLetterTF;
    private javax.swing.JTextField englishTF;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JTextField hLetterTF;
    private javax.swing.JTextField historyTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField mLetterTF;
    private javax.swing.JTextField mathTF;
    private javax.swing.JTextField pLetterTF;
    private javax.swing.JTextField physicsTF;
    // End of variables declaration//GEN-END:variables
}
