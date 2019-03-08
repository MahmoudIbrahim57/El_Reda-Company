/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrow;

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
public class arrowhandler 

        
{ public   Vector flatShow(String key) throws SQLException
    {
         
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select * from FLATS where PNUM = '"+key+"'";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
    
         vv.addElement(res.getString(1));
         
      vv.addElement(res.getString(2));
     vv.addElement(res.getString(3));
        
         
            
           list.addElement(vv);             
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
     public   Vector showComProject(String key) throws SQLException
    {
      
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select COST from EXPENSE where PNUM = '"+key+"'";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getInt("COST"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
     
      public   Vector showProfit(String key) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select COST from PROFITS where PNUM = '"+ key+"'";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getInt("COST"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    
    
}
