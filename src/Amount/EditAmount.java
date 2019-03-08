/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Amount;

import Database.DB_Connection;
import Expensives.expHandler;
import Flats.FlatHandler;
import Projects.ediedProj;
import Projects.insertProj;
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
import onwner.OwnerHandler;

/**
 *
 * @author M_Ibrahiem
 */
public class EditAmount extends javax.swing.JFrame {

    /**
     * Creates new form EditAmount
     */
    public EditAmount() throws SQLException {
        initComponents();
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        showPCom2();
    }

    private void showFCom() throws SQLException {

        FlatHandler f = new FlatHandler();

        Vector pnum = f.showComFlats();
        for (int i = 0; i < pnum.size(); i++) {

            flatnum.addItem(pnum.elementAt(i));
        }

    }

    private void showPCom2() throws SQLException {

        expHandler f = new expHandler();

        Vector pnum2 = f.showComProject();
        for (int i = 0; i < pnum2.size(); i++) {

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

        jLabel4 = new javax.swing.JLabel();
        arrowPriceField1 = new javax.swing.JTextField();
        projPriceField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        arrowPriceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        projPriceField = new javax.swing.JTextField();
        projInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        flatnum = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        projAreaField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        arrowPriceField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pnumCombo = new javax.swing.JComboBox<>();

        setTitle("تعديل الأقساط");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("الفتره الشهريه : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("قيمة القسط: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("تاريخ التعاقد: ");

        projInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        projInsert.setText("تعديل");
        projInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projInsertAddAmo(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("رقم الشقه: ");

        flatnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosF(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("عدد الاقساط المدفوعه: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("عدد الاقساط: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("المقدم: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("رقم المشروع :");

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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projAreaField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnumCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(flatnum, 0, 257, Short.MAX_VALUE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(arrowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(362, 362, 362)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(projPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(projPriceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(362, 362, 362)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(arrowPriceField3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(arrowPriceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(projInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pnumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flatnum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projAreaField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projPriceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(arrowPriceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrowPriceField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(projInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projInsertAddAmo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projInsertAddAmo
        try {
            String fnum, pr, acount, acost, period, paid, date;
            fnum = flatnum.getSelectedItem().toString();

            acount = projAreaField1.getText();
            paid = projPriceField.getText();
            period = arrowPriceField.getText();
            acost = projPriceField1.getText();
            date = arrowPriceField1.getText();

            pr = arrowPriceField3.getText();
            int ac, p, per, c, pre;
            ac = Integer.parseInt(acount);
            pre = Integer.parseInt(pr);
            p = Integer.parseInt(paid);
            per = Integer.parseInt(period);
            c = Integer.parseInt(acost);

            DB_Connection db = new DB_Connection();
            Connection co = db.conect();
            String sql = "update AMOUNT set  ACOUNT=" + ac + ",PAID=" + p + ",PERIODS=" + per + ",ACOST=" + c + ",ADATE='" + date + "',PRE=" + pre + " where FNUM ='" + fnum + "'";;
            Statement st = co.createStatement();
            int rows = st.executeUpdate(sql);
            co.commit();
            st.close();

            JOptionPane.showMessageDialog(null, "تم التعديل بنجاح");
            this.setVisible(false);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "لم يتم التعديل .. يجب إدخال البيانات بطريقة صحيحة");
            this.setVisible(false);

        } catch (NumberFormatException nex) {
            JOptionPane.showMessageDialog(null, "لم يتم التعديل .. يجب إدخال البيانات بطريقة صحيحة");
            this.setVisible(false);
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "لا يوجد بيانات");
            this.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " حدث خطأ ما حاول مرة أخرى");
            this.setVisible(false);
        }

    }//GEN-LAST:event_projInsertAddAmo

    private void chosF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chosF

        if (flatnum.getItemCount() != 0) {
            try {
                String sele = flatnum.getSelectedItem().toString();

                DB_Connection db = new DB_Connection();
                Connection co = db.conect();
                Statement st = co.createStatement();
                String sql = "select * from AMOUNT where FNUM = '" + sele + "'";
                ResultSet res = st.executeQuery(sql);

                res.next();

                projAreaField1.setText("" + res.getInt(2));
                projPriceField.setText("" + res.getInt(3));
                arrowPriceField.setText("" + res.getInt(4));
                projPriceField1.setText("" + res.getInt(5));
                arrowPriceField1.setText("" + res.getString(6));

                arrowPriceField3.setText("" + res.getInt(7));

                co.close();
                st.close();
                res.close();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_chosF

    private void pnumCombopro_selected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumCombopro_selected
        try {
            flatnum.removeAllItems();
            Vector KEY = showComProKey();
            Collections.sort(KEY);
            for (int i = 0; i < KEY.size(); i++) {

                flatnum.addItem(KEY.elementAt(i));
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
            java.util.logging.Logger.getLogger(EditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditAmount().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditAmount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrowPriceField;
    private javax.swing.JTextField arrowPriceField1;
    private javax.swing.JTextField arrowPriceField3;
    private javax.swing.JComboBox flatnum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> pnumCombo;
    private javax.swing.JTextField projAreaField1;
    private javax.swing.JButton projInsert;
    private javax.swing.JTextField projPriceField;
    private javax.swing.JTextField projPriceField1;
    // End of variables declaration//GEN-END:variables
}