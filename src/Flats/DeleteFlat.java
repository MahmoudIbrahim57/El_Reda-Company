/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Flats;

import Database.DB_Connection;
import Projects.DeleteProject;
import Projects.ProjectHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author M_Ibrahiem
 */
public class DeleteFlat extends javax.swing.JFrame {

    /**
     * Creates new form DeleteFlat
     */
    public DeleteFlat() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        showPCom();
        
    }
private void  showPCom() throws SQLException{
    
 FlatHandler f=new FlatHandler();
     
            Vector pnum=f.showComP();
            for(int i=0;i<pnum.size();i++){
            
            delCombo.addItem(pnum.elementAt(i));
            }
           
}
     public   Vector showComFlatNum() throws SQLException
    {
        String sel = delCombo.getSelectedItem().toString();
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select FNUM from FLATS where PNUM='"+sel+"'" ;
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getString("FNUM"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        DelBut = new javax.swing.JButton();
        delCombo1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setTitle("حذف الشقق");

        delCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllPro(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ادخل رقم المشروع");

        DelBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DelBut.setText("حذف");
        DelBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFlat(evt);
            }
        });

        delCombo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllF(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ادخل رقم الشقه");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(DelBut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(DelBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllPro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllPro
        try {
            delCombo1.removeAllItems();
           
         
                Vector pnum=showComFlatNum();
                for(int i=0;i<pnum.size();i++){
                
                delCombo1.addItem(pnum.elementAt(i));
                }
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_AllPro

    private void DeleteFlat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFlat
        try {

            String sele = delCombo.getSelectedItem().toString();
              String sele2 = delCombo1.getSelectedItem().toString();
              
            DB_Connection db=new DB_Connection();
            Connection co = db.conect();
            Statement st=  co.createStatement();
            String sql="delete FLATS where PNUM="+"'"+sele+"'and FNUM='"+sele2+"'";
           
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
            delCombo1.removeItem(sele2);
            
        } catch (SQLException ex) {
            
        }
         catch(NullPointerException n)
         {
             JOptionPane.showMessageDialog( null, "لا يوجد بيانات");
         }
    }//GEN-LAST:event_DeleteFlat

    private void AllF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllF
        // TODO add your handling code here:
    }//GEN-LAST:event_AllF

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
            java.util.logging.Logger.getLogger(DeleteFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeleteFlat().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteFlat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBut;
    private javax.swing.JComboBox delCombo;
    private javax.swing.JComboBox delCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
