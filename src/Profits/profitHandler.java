/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Profits;

import Database.DB_Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Ahmed Teleb
 */
public class profitHandler 
{
     public   Vector showComProfit2() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select KEY from PROFITS";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getString("KEY"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
      public   Vector showComProfit() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select ID from PROFITS";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getInt("ID"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
     public   Vector showComP() throws SQLException
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
      public   Vector profitShow(String key) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select * from PROFITS where PNUM = '"+key+"' order by KEY ";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
      vv.addElement(res.getString(3));
        
         vv.addElement(res.getInt(2));
            vv.addElement(res.getString(4));
   
      
            vv.addElement(res.getString(5));
                 vv.addElement(res.getString(6));
           list.addElement(vv);             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    
     
    
    
}
