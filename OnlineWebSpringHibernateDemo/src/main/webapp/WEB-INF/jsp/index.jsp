<%-- 
    Document   : index.jsp
    Created on : Jul 13, 2022, 11:32:02 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center text-danger">Products List</h1>
<form action="">
    <div class="row">
        <div class="col-md-11">
            <input class="form-control" type="text" name="kw" placeholder="Enter keyword..."/>
        </div>
        <div class="col-md-1">
            <input type="submit" value="Search" class="btn btn-danger"/>
        </div>
    </div>
</form>
<div class="row d-flex justify-content-center">
    <c:forEach var="pro" items="${products}">
        <div class="card col-md-3" style="margin: 10px">
            <c:if test="${pro.image != null && pro.image.startsWith('https')==true}">
                <img class="card-img-top" src="<c:url value="${pro.image}"/>" alt="${pro.name}">
            </c:if>
            <c:if test="${pro.image == null || pro.image.startsWith('https')==false}">
                <img class="card-img-top" src="https://res.cloudinary.com/dgqmraoge/image/upload/v1657788394/ohkqxwhj5qgbmfewuvri.jpg" alt="${pro.name}">
            </c:if>
            <div class="card-body">
                <h3 class="card-title">${pro.name}</h3>
                <h4 class="card-title">${pro.price}</h4>
                <p class="card-text">Some example text.</p>
                <a href="#" class="btn btn-primary">See Detail</a>
            </div>
        </div>
    </c:forEach>
</div>
<div class="justify-content-center">
    <ul class="pagination">
        <c:forEach begin="1" end="${Math.ceil(counter/6)}" var="i">
            <li class="page-item">
                <a class="page-link" href="<c:url value="/"/>?page=${i}">
                    ${i}
                </a>
            </li>
        </c:forEach>
    </ul>
</div>
