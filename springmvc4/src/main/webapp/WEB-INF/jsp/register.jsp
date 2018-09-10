<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error {
            color: chartreuse;
        }

        .errorblock {
            color: blue;
            background-color: aqua;
            border: 3px solid chartreuse;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h2>Customer Register Form - JSR303 @Valid example</h2>
<form:form action="register" method="post" modelAttribute="admin">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Customer Name :</td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Customer Age :</td>
            <td><form:input path="password"/></td>
            <td><form:errors path="password" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Customer Email :</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Register"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
