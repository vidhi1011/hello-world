<%-- 
    Document   : loginprocess
    Created on : Sep 24, 2015, 5:32:23 PM
    Author     : Vidhi Dave
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.LoginDao"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="bean.LoginBean" scope="request"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=LoginDao.validate(obj);  
if(status){  
out.println("welcome");
%>

     
<%
  
}  
else  
{  
out.print("Sorry, email or password error");  
%>  

<%  
}  
%>  
    </body>
</html>
