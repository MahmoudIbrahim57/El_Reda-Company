/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Amount;

import Flats.FlatHandler;
import Flats.ShowFlats;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M_Ibrahiem
 */
public class ShowAmounts extends javax.swing.JFrame {

    /**
     * Creates new form ShowAmounts
     */
    public ShowAmounts() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        setTitle("عرض الاقساط");
        showPCom();
    }
    String sele;
     private void  showPCom() throws SQLException{
    
         AmountHandler  f=new AmountHandler();
     
            Vector pp=f.showComProject();
            for(int i=0;i<pp.size();i++){
            
            jComboBox1.addItem(pp.elementAt(i).toString());
            }
         
}
private void fillAmounts() throws SQLException{
 DefaultTableModel modle =(DefaultTableModel)AmountTab.getModel();
 modle.setRowCount(0);
     AmountHandler ff=new AmountHandler();
     Vector flat=ff.amountShow(sele);
       for(int i=0;i<flat.size();i++){
         Vector list=(Vector) flat.elementAt(i);
modle.addRow(list);  
       }
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AmountTab = new javax.swing.JTable();
        addAm = new javax.swing.JButton();
        deleteAmo = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        Printbut = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setTitle("عرض الأقساط");

        AmountTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "رقم الشقه", "عدد الاقساط", "عدد الاقساط المدفوعه", "الفتره الشهريه للقسط", "قيمة القسط", "تاريخ التعاقد", "المقدم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AmountTab);

        addAm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addAm.setText("إضافة");
        addAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAmAddNewFlat(evt);
            }
        });

        deleteAmo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteAmo.setText("حذف");
        deleteAmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAmoDeletFlat(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit.setText("تعديل");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEDIT(evt);
            }
        });

        Printbut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Printbut.setText("طباعة");
        Printbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbutPrintFlats(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("تحديث البيانات");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4refreshButton(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("اختر رقم المشروع :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Printbut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton4)
                .addGap(102, 102, 102)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(deleteAmo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(addAm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAmo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Printbut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAmAddNewFlat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAmAddNewFlat
        try {
            InsertAmount ins=new InsertAmount();
            ins.setVisible(true);
        } catch (SQLException ex) {
      
        }
        
    }//GEN-LAST:event_addAmAddNewFlat

    private void deleteAmoDeletFlat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAmoDeletFlat
        try {
            DeletAmount del=new DeletAmount();
            del.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ShowAmounts.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteAmoDeletFlat

    private void editEDIT(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEDIT
        try {
            EditAmount edit=new EditAmount();
            edit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ShowAmounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editEDIT
 private void p(String msg){
   {
        JOptionPane.showMessageDialog(null, msg);
    }}
    private void PrintbutPrintFlats(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbutPrintFlats

        try {
            boolean b = AmountTab.print();        // TODO add your handling code here:
        } catch (PrinterException ex) {

            String printMsg ="عملية الطباعة لم تتم بنجاح";
            p(printMsg);
        }
    }//GEN-LAST:event_PrintbutPrintFlats

    private void jButton4refreshButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4refreshButton
        try {
            this.fillAmounts();

        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jButton4refreshButton

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

       
           sele = jComboBox1.getSelectedItem().toString();
     try {
      fillAmounts();
     } catch (SQLException ex) {
         Logger.getLogger(ShowFlats.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowAmounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAmounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAmounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAmounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowAmounts().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowAmounts.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmountTab;
    private javax.swing.JButton Printbut;
    private javax.swing.JButton addAm;
    private javax.swing.JButton deleteAmo;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
