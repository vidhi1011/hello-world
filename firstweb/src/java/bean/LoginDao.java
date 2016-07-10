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
public class LoginDao {  
  
public static boolean  validate(LoginBean bean){  
boolean status=false;  
ResultSet rs=null;
try{  
Connection con=ConnectionProvider.getCon();  
              
PreparedStatement ps=con.prepareStatement(  
    "select * from db1.dbo.signup where email=? and psw=?");  
  
ps.setString(1,bean.getEmail());  
ps.setString(2, bean.getPsw());  
              
rs=ps.executeQuery();
   status=rs.next();           
}
catch(Exception e){ e.printStackTrace();}  
  
return status;  
  
}  
}  