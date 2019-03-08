/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Flats;

import Database.DB_Connection;
import Projects.ProjectHandler;
import Projects.insertProj;
import java.awt.ComponentOrientation;
import java.sql.Connection;
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
public class InsertFlats extends javax.swing.JFrame {

    /**
     * Creates new form InsertFlats
     */
    public InsertFlats() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        showPCom();
        fnumber.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);    }
         private void  showPCom() throws SQLException{
    
            FlatHandler f=new FlatHandler();
     
            Vector pnum=f.showComP();
            for(int i=0;i<pnum.size();i++){
            
            PnumCom.addItem(pnum.elementAt(i));
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
        statNumber = new javax.swing.JLabel();
        Pnumber = new javax.swing.JLabel();
        fnumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PnumCom = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        setTitle("إضافة شقة");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" رقم الشقه: ");

        statNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statNumber.setText("الحاله : ");

        Pnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pnumber.setText("رقم المشروع: ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("إضافة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlats(evt);
            }
        });

        PnumCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnumComActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "مباع", "متاح" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnumber)
                    .addComponent(PnumCom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(statNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PnumCom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void p(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }
    private void addFlats(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlats
 try {
            String pnum ,  apper,fnum,stat;
            fnum = fnumber.getText().toString();
           
            stat = jComboBox2.getSelectedItem().toString();
            pnum=PnumCom.getSelectedItem().toString();
            
      
             
           
             
            
            DB_Connection db=new DB_Connection();
            Statement st;
            int rows;
            Connection co = db.conect();         
              String sql="insert into FLATS (FNUM,STATUS,PNUM)VALUES('"+fnum+"','"+stat+"','"+pnum+"')";
                st = co.createStatement();
                rows = st.executeUpdate(sql);
                co.commit();
          
              st.close();
              
              if(rows>0)
            {
                JOptionPane.showMessageDialog(null, "تم الإدخال بنجاح");
            }
            else{
                JOptionPane.showMessageDialog(null, "هناك مشكلة فى عملية الإدخال ");
            }
                  
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "هناك مشكلة فى عملية الإدخال ");
           
        }
        catch(NullPointerException n)
         {
             JOptionPane.showMessageDialog( null, "لا يوجد بيانات");
         }
        catch(NumberFormatException nu)
         {
             JOptionPane.showMessageDialog( null, "يجب ادخال البيانات بطريقة صحيحة");
         }
    }//GEN-LAST:event_addFlats

    private void PnumComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnumComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnumComActionPerformed

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
            java.util.logging.Logger.getLogger(InsertFlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertFlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertFlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertFlats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InsertFlats().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(InsertFlats.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox PnumCom;
    private javax.swing.JLabel Pnumber;
    private javax.swing.JTextField fnumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel statNumber;
    // End of variables declaration//GEN-END:variables
}
