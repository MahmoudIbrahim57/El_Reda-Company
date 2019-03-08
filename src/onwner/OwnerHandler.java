/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onwner;

import Database.DB_Connection;
import Projects.DeleteProject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M_Ibrahiem
 */
public class OwnerHandler {
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
     public   Vector showComFlats(String kk) throws SQLException
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
              
      public   Vector showComNames() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select ONAME from OWNER";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
             
            
           list.addElement(res.getString("ONAME"));             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
      
      
     public   Vector ownerShow(String key) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select * from OWNER where PNUM = '"+key+"'";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
   
         vv.addElement(res.getString(2));
            vv.addElement(res.getInt(1));
         vv.addElement(res.getString(3));
            list.addElement(vv);   
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    
}
