<%-- 
    Document   : index
    Created on : Jul 7, 2022, 2:40:46 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Welcome to our website!</h1>
        <h1>Hello ${name}</h1>
        <h1>${fullName}</h1>
        <form:form method="post" action="/OnlineWebSpringMVCDemoVer2/hello-post" modelAttribute="user">
            <form:input path="firstName"/>
            <form:input path="lastName"/>
            <input type="submit" value="Send"/>
        </form:form>
    </body>
</html>
