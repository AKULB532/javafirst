<%--
  Created by IntelliJ IDEA.
  User: 54110
  Date: 2020/11/9
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--使用el表达式 是否当作字符串来进行处理-->
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <table border="1">
            <tr>
                <th>用户id</th>
                <th>用户姓名</th>
                <th>用户密码</th>
                <th>email</th>
                <th>操作</th>
            </tr>

            <c:forEach var="user" items="${user}">
                <tr>
                    <td>${user.uid}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.email}</td>
                    <td>
                        <a href="">修改</a>
                        <a href="">删除</a>

                    </td>
                </tr>
            </c:forEach>
        </table>

    </div>
</body>
</html>
