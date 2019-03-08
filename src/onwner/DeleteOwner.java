/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onwner;

import Database.DB_Connection;
import Expensives.expHandler;
import Flats.FlatHandler;
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
public class DeleteOwner extends javax.swing.JFrame {

    /**
     * Creates new form DeleteOwner
     */
    public DeleteOwner() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        showPCom2();
    }
    
    private void  showPCom2() throws SQLException{
    
          expHandler  f=new expHandler();
     
            Vector pnum2=f.showComProject();
            for(int i=0;i<pnum2.size();i++){
            
            pnumCombo.addItem((String) pnum2.elementAt(i));
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

        jLabel1 = new javax.swing.JLabel();
        delCom = new javax.swing.JComboBox();
        delb = new javax.swing.JButton();
        pnumCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ادخل اسم المالك");

        delb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delb.setText("حذف");
        delb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEv(evt);
            }
        });

        pnumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumCombopro_selected(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("رقم المشروع :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(delb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delCom, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delCom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(delb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delEv(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delEv
                                  
     try {
              String sele2 = pnumCombo.getSelectedItem().toString();
                 String sele = delCom.getSelectedItem().toString();
                 DB_Connection db=new DB_Connection();
                 Connection co = db.conect();
                 Statement st=  co.createStatement();
                String sql="delete OWNER where ONAME='"+sele+"' and PNUM= '"+sele2+"'";
             
                 int x= st.executeUpdate(sql);
                  if(x>0)
            {
                JOptionPane.showMessageDialog(null, "تم الحذف بنجاح");
            }
            else{
                JOptionPane.showMessageDialog(null, "هناك مشكلة فى عملية الحذف ");
            }
                
                  co.commit();

            co.close();
            st.close();
             delCom.removeItem(sele);
        }catch (SQLException ex) {
           
        }
         catch(NullPointerException n)
         {
             JOptionPane.showMessageDialog( null, "لا يوجد بيانات");
         }
    
    }//GEN-LAST:event_delEv

    private void pnumCombopro_selected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumCombopro_selected
        try {
            delCom.removeAllItems();
            Vector KEY = showComProKey();
            Collections.sort(KEY);
            for (int i = 0; i < KEY.size(); i++) {

                delCom.addItem(KEY.elementAt(i));
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_pnumCombopro_selected

     public   Vector showComProKey() throws SQLException
    {
        String sel = pnumCombo.getSelectedItem().toString();
        DB_Connection db = new DB_Connection();
        Connection co = db.conect();
        Statement st = co.createStatement();
        String sql = "select ONAME from OWNER where PNUM='" + sel + "'";
        ResultSet res = st.executeQuery(sql);
        Vector list = new Vector();

    while(res.next()){
             
            
           list.addElement(res.getString("ONAME"));             
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
            java.util.logging.Logger.getLogger(DeleteOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeleteOwner().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteOwner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox delCom;
    private javax.swing.JButton delb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> pnumCombo;
    // End of variables declaration//GEN-END:variables
}
