<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>
<html>
<head>
    <title></title>
    <style type="text/css">
    	.user {font-size:20px;font-weight:bold;}
    	.logout {margin-top:40px;}
    </style>
</head>
<body>
欢迎<span class="user">${subject.principal}</span>登录成功！<br/>
<shiro:hasPermission name="vip:show">
<form action="vipshow" method="post">
<input type="submit" value="查看" />
</form>
</shiro:hasPermission>
<a href="${pageContext.request.contextPath}/logout" class="logout">退出</a>
</body>
</html>