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
  
public class RegisterDao 
{  
  
public static int register(User u)
{  
int status=0;  
try{ 

Connection con=ConnectionProvider.getCon();  
PreparedStatement ps=con.prepareStatement("insert into db1.dbo.signup values(?,?,?,?)");  
ps.setString(1,u.getFname());  
ps.setString(2,u.getLname());  
ps.setString(3,u.getEmil());  
ps.setString(4,u.getPsw());  
              
status=ps.executeUpdate();  
}
catch(Exception e){e.printStackTrace();}  
      
return status;  
}  
}  
