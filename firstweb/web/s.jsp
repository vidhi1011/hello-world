<%-- 
    Document   : s
    Created on : 26 Jun, 2016, 9:07:30 PM
    Author     : Vidhi Dave
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> site </title>
<link rel="stylesheet" href="s.css">

<body >
<div>
    <h1>
    My secret diary 
    <!--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome-->
   
</h1>
     <h3>Welcome <%= session.getAttribute("firstname")%></h3>
<form>
    <textarea rows="80" cols="120" class="pink" placeholder="enter your notes" name="notes">
</textarea><br><br>
<center><input type="submit" value="Save"></center>
</form>
</div>   
</body>
</head>
</html>