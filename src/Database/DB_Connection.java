/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author M_Ibrahiem
 */
public class DB_Connection {
    Connection conec;
    private static final String URL="jdbc:oracle:thin:@localhost:1521/XE";
        private static final String  USER="REDA";
          private static final String  PASSWORD="REDA";
    public DB_Connection() throws SQLException{
    DriverManager.registerDriver(new oracle.jdbc.OracleDriver() );
      
     conec=  DriverManager.getConnection(URL, USER, PASSWORD);
        
     
    }
    public Connection conect()
    {
        return  conec;
    }
    
}
