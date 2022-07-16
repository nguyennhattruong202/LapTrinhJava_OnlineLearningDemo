<%-- 
    Document   : product.jsp
    Created on : Jul 14, 2022, 2:46:45 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1 class="text-center text-danger">Products Management</h1>
<c:url value="/admin/products" var="action"/>
<c:if test="${errorMessage != null}">
    <div class="alert alert-danger">${errorMessage}</div>
</c:if>
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">
    <div class="form-group">
        <label for="name">Name</label>
        <form:input type="text" id="name" path="name" cssClass="form-control"/>
        <form:errors path="name" cssClass="text-danger" element="div"/>
    </div>
    <div class="form-group">
        <label for="description">Description</label>
        <form:textarea id="description" path="description" cssClass="form-control"/>
    </div>
    <div class="form-group">
        <label for="price">Price</label>
        <form:input type="text" id="price" path="price" cssClass="form-control"/>
        <form:errors path="price" cssClass="text-danger" element="div"/>
    </div>
    <div class="form-group">
        <label for="cate">Category</label>
        <form:select id="cate" path="categoryId" cssClass="form-control">
            <c:forEach items="${categories}" var="cate">
                <option value="${cate.id}">${cate.name}</option>
            </c:forEach>
        </form:select>
        <form:errors path="categoryId" cssClass="text-danger" element="div"/>
    </div>
    <div class="form-group">
        <label for="file">Product image</label>
        <form:input type="file" id="file" path="file" cssClass="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" value="Add products" class="btn btn-danger">
    </div>
</form:form>