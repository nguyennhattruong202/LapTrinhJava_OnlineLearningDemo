<%-- 
    Document   : index.jsp
    Created on : Jul 13, 2022, 11:32:02 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>Hello Online Web Spring Hibernate Demo!</h1>
        <ol>
            <c:forEach var="c" items="${categories}">
                <li>${c.id} - ${c.name}</li>
            </c:forEach>
        </ol>
    </body>
</html>
