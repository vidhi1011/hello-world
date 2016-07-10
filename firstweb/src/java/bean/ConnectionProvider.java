/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Vidhi Dave
 */
import java.sql.*;  
import static bean.Provider.*;  
  
public class ConnectionProvider {  
private static Connection con=null;  
static{  
try{  
Class.forName(DRIVER);  
con=DriverManager.getConnection(CONNECTION_URL);  
}
catch(Exception e){e.printStackTrace();}  
}  
  
public static Connection getCon()
{  
    return con;  
}  
  
}  