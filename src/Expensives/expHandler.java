/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Expensives;

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
public class expHandler 
{
     public   Vector showComFlats(String kk) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select KEY from EXPENSE where PNUM ='"+kk+"'";
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
     
      public   Vector expShow(String key) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select * from EXPENSE where PNUM = '"+key+"' order by KEY ";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
    
         vv.addElement(res.getString(3));
         vv.addElement(res.getString(4));
         vv.addElement(res.getString(5));
         vv.addElement(res.getInt(2));
            vv.addElement(res.getString(6));
           list.addElement(vv);             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    
      public Vector getExpenses() throws SQLException
    {
        Vector list = new Vector();
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select ID from EXPENSE   ";
                
        Statement stmt =  conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        while(rset.next())
        {
          list.addElement( rset.getInt("ID") );
        }  
        
        rset.close();
        stmt.close();
        conn.close();
        
        return list;
    }
      public Vector getExpenses2() throws SQLException
    {
        Vector list = new Vector();
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select KEY from EXPENSE   ";
                
        Statement stmt =  conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        while(rset.next())
        {
          list.addElement( rset.getString("KEY") );
        }  
        
        rset.close();
        stmt.close();
        conn.close();
        
        return list;
    }
}
