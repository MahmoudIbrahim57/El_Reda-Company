/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Partner;

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
public class partnerHandler
{
      public   Vector partnerShow(String key) throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select * from PARTNER  where PNUM = '"+key+"' "
                   + "ORDER BY NUM";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
    
         vv.addElement(res.getInt("NUM"));
         vv.addElement(res.getString("PNAME"));
           vv.addElement(res.getString("PNUM"));
         vv.addElement(res.getInt("PHONE"));
               vv.addElement(res.getInt("PAID"));
         vv.addElement(res.getInt("COST"));
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
      public Vector getpartner() throws SQLException
    {
        Vector list = new Vector();
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select ID from PARTNER " ;
                
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
    
}
