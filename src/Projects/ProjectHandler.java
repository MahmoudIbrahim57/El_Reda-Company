/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import Database.DB_Connection;

/**
 *
 * @author M_Ibrahiem
 */
public class ProjectHandler
{
     
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
     public   Vector projectShow() throws SQLException
    {
     DB_Connection db=new DB_Connection();
      Connection co = db.conect();
     Statement st=  co.createStatement();
           String sql="select * from PROJECTS order by PNUM";
     ResultSet res= st.executeQuery(sql);
        Vector list =new Vector();
                
    while(res.next()){
              Vector vv=new Vector();
    
       vv.addElement(res.getString(4));
         vv.addElement(res.getInt(1));
         vv.addElement(res.getInt(2));
         vv.addElement(res.getInt(3));
              
           list.addElement(vv);             
    }
    co.close();
    st.close();
    res.close();   
    return list;
  }
    
    public Vector getProjects() throws SQLException
    {
        Vector list = new Vector();
        DB_Connection dbconn = new DB_Connection();
        Connection conn = dbconn.conect();
        String sql= "select PNUM from PROJECTS ";
                
        Statement stmt =  conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        while(rset.next())
        {
          list.addElement( rset.getString("PNUM") );
        }  
        
        rset.close();
        stmt.close();
        conn.close();
        
        return list;
    }
    
}
