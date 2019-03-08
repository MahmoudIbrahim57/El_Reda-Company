/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projcet_partner;

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
public class PpHandler
{
      public Vector getProjPartner() throws SQLException
    {
        Vector list = new Vector();
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select * from PROJECT_PARTNER ";
                
        Statement stmt =  conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        while(rset.next())
        {
            Vector vv=new Vector();
    
         vv.addElement(rset.getInt(1));
         vv.addElement(rset.getString(2));
            
           list.addElement(vv); 
         
        }  
        
        rset.close();
        stmt.close();
        conn.close();
        
        return list;
    }
      
        public Vector getProjPartnerUID() throws SQLException
    {
        Vector list = new Vector();
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select DISTINCT ID from PROJECT_PARTNER ";
                
        Statement stmt =  conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        while(rset.next())
        {
        
            
           list.addElement(rset.getInt("ID")); 
         
        }  
        
        rset.close();
        stmt.close();
        conn.close();
        
        return list;
    }
}
