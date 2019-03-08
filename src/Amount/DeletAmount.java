/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Amount;

import Database.DB_Connection;
import Expensives.expHandler;
import Projects.DeleteProject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author M_Ibrahiem
 */
public class DeletAmount extends javax.swing.JFrame {

    /**
     * Creates new form DeletOwner
     */
    public DeletAmount() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
         showFNUMCom();
         showPCom2();
    }
    
    private void showPCom2() throws SQLException {

        expHandler f = new expHandler();

        Vector pnum2 = f.showComProject();
        for (int i = 0; i < pnum2.size(); i++) {

            pnumCombo.addItem((String) pnum2.elementAt(i));
        }

    }
 private void  showFNUMCom() throws SQLException{
    
 AmountHandler f=new AmountHandler();
     
            Vector am=f.showComS();
            for(int i=0;i<am.size();i++){
            
          	comam.addItem(am.elementAt(i));
            }
           
}         
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DelBut = new javax.swing.JButton();
        comam = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        pnumCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setTitle("حذف قسط");

        DelBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelBut.setText("حذف");
        DelBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelButDeleteFlat(evt);
            }
        });

        comam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comamAllF(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ادخل رقم الشقه: ");

        pnumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumCombopro_selected(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("رقم المشروع :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(DelBut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comam, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(DelBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DelButDeleteFlat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButDeleteFlat
        try {

            String sele = comam.getSelectedItem().toString();
           

            DB_Connection db=new DB_Connection();
            Connection co = db.conect();
            Statement st=  co.createStatement();
            String sql="delete AMOUNT where FNUM='"+sele+"'";

            int x= st.executeUpdate(sql);

            co.commit();
            co.close();
            st.close();
            
         JOptionPane.showMessageDialog(null, "تم الحذف  بنجاح");
                this.setVisible(false);
           
            
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "لم يتم التعديل .. يجب إدخال البيانات بطريقة صحيحة");
           this.setVisible(false);}
        catch(NumberFormatException nex)
       {
           JOptionPane.showMessageDialog(null, "لم يتم التعديل .. يجب إدخال البيانات بطريقة صحيحة");
          this.setVisible(false);}
       catch(NullPointerException n)
       {
           JOptionPane.showMessageDialog( null, "لا يوجد بيانات");
          this.setVisible(false);}
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, " حدث خطأ ما حاول مرة أخرى");
          this.setVisible(false);}
            
            
    }//GEN-LAST:event_DelButDeleteFlat

    private void comamAllF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comamAllF
        // TODO add your handling code here:
    }//GEN-LAST:event_comamAllF

    private void pnumCombopro_selected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumCombopro_selected
        try {
            comam.removeAllItems();
            Vector KEY = showComProKey();
            Collections.sort(KEY);
            for (int i = 0; i < KEY.size(); i++) {

                comam.addItem(KEY.elementAt(i));
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_pnumCombopro_selected

     public Vector showComProKey() throws SQLException {
        String sel = pnumCombo.getSelectedItem().toString();
        DB_Connection db = new DB_Connection();
        Connection co = db.conect();
        Statement st = co.createStatement();
        String sql = "select FNUM from FLATS where PNUM='" + sel + "'";
        ResultSet res = st.executeQuery(sql);
        Vector list = new Vector();

        while (res.next()) {

            list.addElement(res.getString("FNUM"));
        }
        co.close();
        st.close();
        res.close();
        return list;
    }

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
            java.util.logging.Logger.getLogger(DeletAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeletAmount().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeletAmount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBut;
    private javax.swing.JComboBox comam;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> pnumCombo;
    // End of variables declaration//GEN-END:variables
}
