/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Amount;

import Database.DB_Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author M_Ibrahiem
 */

public class AmountHandler {
     public   Vector showComAM() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select FNUM from AMOUNT";
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
     public   Vector showComS() throws SQLException
    {
      DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select FNUM from AMOUNT";
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
     
   public   Vector showComA(String kk) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select FNUM from FLATS where PNUM = '"+kk+"'";
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
   public   Vector showComProject() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select PNUM from PROJECTS";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getString("PNUM"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    public   Vector amountShow(String key) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
            String sql="select * from AMOUNT where PNUM = '"+key+"'";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
    
         vv.addElement(res.getString(1));
         vv.addElement(res.getInt(2));
         vv.addElement(res.getInt(3));
      vv.addElement(res.getInt(4));
     vv.addElement(res.getInt(5));
        vv.addElement(res.getString(6));
         vv.addElement(res.getInt(7));
              
           list.addElement(vv);             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    
}
