/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Partner;

import Database.DB_Connection;
import Expensives.expHandler;
import Projects.ediedProj;
import java.awt.ComponentOrientation;
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
 * @author Ahmed Teleb
 */
public class edietPartner extends javax.swing.JFrame {

    /**
     * Creates new form edietPartner
     */
    public edietPartner() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        getPart();
        showPCom2();
        nameP.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
    
    private void  showPCom2() throws SQLException{
    
          expHandler  f=new expHandler();
     
            Vector pnum2=f.showComProject();
            for(int i=0;i<pnum2.size();i++){
            
            pnumCombo.addItem((String) pnum2.elementAt(i));
            }
           
        }
    
       private void getPart()throws SQLException
    {
     partnerHandler hndlr = new partnerHandler();
       Vector list  = hndlr.getpartner();
       for(int i=0; i<list.size(); i++)
       {
         idCombo.addItem( list.elementAt(i).toString() ); 
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
        idCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameP = new javax.swing.JTextField();
        mobFiled = new javax.swing.JTextField();
        edietButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pnumCombo = new javax.swing.JComboBox<>();
        parnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setTitle("تعديل شريك");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("رقم الشريك :");

        idCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboselected(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("اسم الشريك :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("رقم موبايل الشريك :");

        edietButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edietButton.setText("تعديل");
        edietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edietButtonActionPerformed(evt);
            }
        });

        jLabel5.setDisplayedMnemonic('\u0627');
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("المدفوع: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("الربح: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("رقم المشروع :");

        pnumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumCombopro_selected(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("رقم الشريك :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameP, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(parnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnumCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mobFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel4))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parnum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(mobFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idComboselected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboselected

        if(idCombo.getItemCount() != 0)
      {
        try {
            String sele = idCombo.getSelectedItem().toString();

            DB_Connection db=new DB_Connection();
            Connection co = db.conect();
            Statement st=  co.createStatement();
            String sql="select * from PARTNER where NUM = '"+ sele+"'";
            ResultSet res= st.executeQuery(sql);

            res.next();
            parnum.setText(""+res.getInt("NUM"));
            nameP.setText(""+res.getString("PNAME"));
            mobFiled.setText(""+res.getString("PHONE"));
            paid.setText(""+res.getString("PAID"));
               cost.setText(""+res.getString("COST"));
            co.close();
            st.close();
            res.close();
        } catch (SQLException ex) {
            
        }
      }
    }//GEN-LAST:event_idComboselected

    private void edietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edietButtonActionPerformed
        try {
              String sele = idCombo.getSelectedItem().toString();
            
              String pnum ,intnum, namePart,strpaid,strcost;
                pnum = mobFiled.getText();
                namePart = nameP.getText();
                intnum=parnum.getText();
                strpaid=paid.getText();
            strcost=cost.getText();
                int intpnum,intpaid,intcost,intnum2;
               intnum2=Integer.parseInt(intnum);
                intpnum = Integer.parseInt(pnum);
                 intpaid=Integer.parseInt(strpaid);
            intcost=Integer.parseInt(strcost);
                  DB_Connection db=new DB_Connection();
                  Connection co = db.conect();
                  
  String sql="update PARTNER set NUM ="+intnum2+", "
          + "PHONE ="+intpnum+",PNAME='"+namePart+"',"
          + "PAID="+intpaid+",COST ="+intcost+
          "where NUM="+intnum2+"";
                 Statement st=  co.createStatement();
               
                 st.executeUpdate(sql);
            
                 int rows=   st.executeUpdate(sql);
                 co.commit();  
                 co.close();
                 st.close();
                 
                JOptionPane.showMessageDialog(null, "تم التعديل بنجاح");
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
            
            
    }//GEN-LAST:event_edietButtonActionPerformed

    private void pnumCombopro_selected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumCombopro_selected
        try {
            idCombo.removeAllItems();
            Vector KEY = showComProKey();
            Collections.sort(KEY);
            for (int i = 0; i < KEY.size(); i++) {

                idCombo.addItem(KEY.elementAt(i));
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
        String sql = "select NUM from PARTNER where PNUM='" + sel + "'";
        ResultSet res = st.executeQuery(sql);
        Vector list = new Vector();

    while(res.next()){
             
            
           list.addElement(res.getInt("NUM"));             
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
            java.util.logging.Logger.getLogger(edietPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edietPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edietPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edietPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new edietPartner().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(edietPartner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cost;
    private javax.swing.JButton edietButton;
    private javax.swing.JComboBox idCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobFiled;
    private javax.swing.JTextField nameP;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField parnum;
    private javax.swing.JComboBox<String> pnumCombo;
    // End of variables declaration//GEN-END:variables
}