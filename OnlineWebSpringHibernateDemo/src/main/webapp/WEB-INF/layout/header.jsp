<%-- 
    Document   : header
    Created on : Jul 14, 2022, 10:58:35 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="#">Home</a>
            </li>
            <c:forEach var="cat" items="${categories}">
                <li class="nav-item">
                    <a class="nav-link" href="#">${cat.name}</a>
                </li>
            </c:forEach>
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/cart"/>">Cart</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/admin/products"/>">Admin</a>
            </li>
        </ul>
    </div>
</nav>
