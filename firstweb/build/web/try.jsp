<%-- 
    Document   : try
    Created on : 26 Jun, 2016, 9:06:47 PM
    Author     : Vidhi Dave
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> site </title>
<link rel="stylesheet" href="try.css">
<body >
<div>
    <h1>
    My secret diary 
    <form action="loginprocess" method="get">
<input class="e" type="email" name="email1"  placeholder="abc@gmail.com">  
<input class="p" type="password" name="password1" placeholder="password" >
<input type="submit" name="login" >


</form>
   
             
</h1>
   
    <form action="process" >
        <fieldset class="f"><br>
          
            <h2><center> Sign up!</center> </h2><br>
          <table height="300px"> 
            <tr><td>First name:</td>
                <td><input type="text "  placeholder="enter first name"  name="firstname" class="yellow" size="20"></td></tr>
            <tr><td>Last name:</td>
                <td><input type="text "  placeholder="enter last name"  name="lastname" class="pink" size="20"></td></tr>
            <tr><td>Gender:</td>
                <td> Male
                <input type="radio" name="gender" size="20"></td>
                <td>Female
                <input type="radio" name="gender" size="20"></td></tr>
            <tr><td>email-id:</td>
                <td><input  type="email" name="email"  placeholder="abc@gmail.com"></td></tr>
            <tr><td>password:</td>
                <td><input class="p" type="password" name="password"></td></tr>
            <tr><td>confirm password:</td>
                <td><input class="p" type="password" name="password" ></td></tr>
            <tr><td>submit:</td>
                <td><input type="submit" value="submit" name="m5"></td></tr>

   </table>
        </fieldset>
    </form>
    <% String n=request.getParameter("firstname");
    session.setAttribute("firstname",n);  %>
</div>   
</body>
</head>
</html>
