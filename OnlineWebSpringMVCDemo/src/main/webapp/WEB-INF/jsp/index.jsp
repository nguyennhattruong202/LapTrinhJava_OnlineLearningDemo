<%-- 
    Document   : index
    Created on : Jul 7, 2022, 2:40:46 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Welcome to our website!</h1>
        <h1>Hello ${name}</h1>

        <c:set var="salary" scope="session" value="${20000*2}"/>
        <c:if test="${salary > 20000}">
            <p>My salary is: <c:out value="${salary}"/></p>
        </c:if>

        <c:if test="${fullName != null}">
            <h1>${fullName}</h1>
        </c:if>

        <ul>
            <c:forEach var="i" begin="1" end="10">
                <li>${i}</li>
                </c:forEach>
        </ul>

        <ol>
            <c:forEach var="u" items="${users}">
                <li>${u.lastName} ${u.firstName}</li>
                </c:forEach>
        </ol>

        <ul>
            <c:forTokens var="f" delims="," items="Apple,Orange,Lemon,Cherry">
                <li>${f}</li>
                </c:forTokens>
        </ul>

        <ul>
            <c:forEach var="i" begin="1" end="10">
                <c:choose>
                    <c:when test="${i%2==0}">
                        <li style="color:red"">${i}</li>
                        </c:when>
                        <c:when test="${i%2!=0}">
                        <li style="color:blue">${i}</li>
                        </c:when>
                    </c:choose>
                </c:forEach>
        </ul>

        <c:url value="/hello-post" var="action"/>
        <form:form method="post" action="${action}" modelAttribute="user">
            <spring:message code="label.fName"/>
            <form:input path="firstName"/>
            <spring:message code="label.lName"/>
            <form:input path="lastName"/>
            <input type="submit" value="Send"/>
        </form:form>
    </body>
</html>
