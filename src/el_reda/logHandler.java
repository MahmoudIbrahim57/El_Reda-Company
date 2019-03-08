/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el_reda;

import Database.DB_Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ahmed Teleb
 */
public class logHandler 
{
    public   String passShow() throws SQLException
    { 
         String pass="";
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select PASS from LOGIN ";
                
        Statement stmt =  conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        while(rset.next())
        {
          pass = rset.getString("PASS") ;
        }  
        
        rset.close();
        stmt.close();
        conn.close();
        
        return pass;
    }

    
}
