<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Phone Book by drzinks</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="jquery-3.1.0.min.js" ></script>
    </head>
    <body>
        <div align="center">
            <h1>Contact List</h1>
            <h3><a href="/PhoneBook/contacts">New Contact</a></h3>
            <table border="1">
                <th>No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Action</th>
                 
                <c:forEach var="contact" items="${listContact}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${contact.name}</td>
                    <td>${contact.email}</td>
                    <td>${contact.phone}</td>
                    <td>
                        
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="" onclick="$.ajax({url: '/PhoneBook/contacts/${contact.id}', method: 'DELETE'})" >Delete</a>  
                    </td>
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>