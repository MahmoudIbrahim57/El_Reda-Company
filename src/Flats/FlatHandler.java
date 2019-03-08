
package Flats;

import Database.DB_Connection;
import Projects.insertProj;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

 
public class FlatHandler {
     public   Vector showComFlats() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select FNUM from FLATS";
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
                   public   Vector showONAME() throws SQLException
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
    public   Vector flatShow(String key) throws SQLException
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
    
}
