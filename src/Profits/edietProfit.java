/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Profits;

import Database.DB_Connection;
import Expensives.expHandler;
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
public class edietProfit extends javax.swing.JFrame {

    /**
     * Creates new form edietProfit
     */
    public edietProfit() throws SQLException {
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        showPCom2();
        detailArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
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
        idCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        detailTextArea = new javax.swing.JScrollPane();
        detailArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        pnumField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costField = new javax.swing.JTextField();
        edietButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pro_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pnumField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnumCombo = new javax.swing.JComboBox<>();

        setTitle("تعديل داخل");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("رقم المدخل :");

        idCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboselected(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("التفاصيل :");

        detailArea.setColumns(20);
        detailArea.setRows(5);
        detailTextArea.setViewportView(detailArea);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("رقم المشروع :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("القيمة :");

        edietButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edietButton.setText("تعديل");
        edietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edietButtonedietExp(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("التاريخ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("رقم المدخل :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("رقم المشروع :");

        pnumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumCombopro_selected(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(edietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pro_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(costField)
                            .addComponent(pnumField)
                            .addComponent(detailTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(pnumField1)
                            .addComponent(idCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnumCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(45, 45, 45))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnumField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnumField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(edietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idComboselected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboselected
     if(idCombo.getItemCount() != 0)
      {
        try {
            String sele = idCombo.getSelectedItem().toString();
String asd=pnumCombo.getSelectedItem().toString();
            DB_Connection db=new DB_Connection();
            Connection co = db.conect();
            Statement st=  co.createStatement();
            String sql="select * from PROFITS where KEY = '"+ sele+"' and PNUM='"+asd +"'";
            ResultSet res= st.executeQuery(sql);

            res.next();
            pnumField1.setText(""+res.getString("KEY"));
            detailArea.setText(""+res.getString("DETAILS"));
            pnumField.setText(""+res.getString("PNUM"));
            costField.setText(""+res.getInt("COST"));
            pro_txt.setText(""+res.getString("PROF_DATE"));
              
            co.close();
            st.close();
            res.close();
        } catch (SQLException ex) {
            
        }
      }
    }//GEN-LAST:event_idComboselected

    private void edietButtonedietExp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edietButtonedietExp
        try {
            String sele = idCombo.getSelectedItem().toString();
            String sele2 = pnumCombo.getSelectedItem().toString();
            
            String pnum ,DATE, detailsArea , cost,num;
            DATE=pro_txt.getText();
            pnum = pnumField.getText();
            detailsArea = detailArea.getText();
            cost = costField.getText();
              num =pnumField1.getText();
            int intcost;

            intcost = Integer.parseInt(cost);

            DB_Connection db=new DB_Connection();
            Connection co = db.conect();
            String sql="update PROFITS set PNUM ='"+pnum+"',DETAILS='"+detailsArea+"',COST="+intcost+","
                    + "KEY ='"+num
                    +"',  PROF_DATE='"+DATE+"' where KEY ="+sele+" and PNUM= '"+sele2+"'"  ;
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
            

    }//GEN-LAST:event_edietButtonedietExp

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
        String sql = "select KEY from PROFITS where PNUM='" + sel + "'";
        ResultSet res = st.executeQuery(sql);
        Vector list = new Vector();

    while(res.next()){
             
            
           list.addElement(res.getInt("KEY"));             
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
            java.util.logging.Logger.getLogger(edietProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edietProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edietProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edietProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new edietProfit().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(edietProfit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costField;
    private javax.swing.JTextArea detailArea;
    private javax.swing.JScrollPane detailTextArea;
    private javax.swing.JButton edietButton;
    private javax.swing.JComboBox idCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> pnumCombo;
    private javax.swing.JTextField pnumField;
    private javax.swing.JTextField pnumField1;
    private javax.swing.JTextField pro_txt;
    // End of variables declaration//GEN-END:variables
}