<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//项目的发布路径，例如:  /rabc
	String path = request.getContextPath();
	/*
	全路径，形式如下: http://127.0.0.1:8001/rbac/
	request.getScheme()      ——> http 获取协议
	request.getServerName()  --> 127.0.0.1 获取服务名
	request.getServerPort()  --> 8001 获取端口号
	path                     --> /rbac 获取访问的路径 路
	*/
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
	<head>
		<%-- 
		参考文章:http://www.cnblogs.com/muqianying/archive/2012/03/16/2400280.html
		--%>
		<base href="<%=basePath%>">
		<meta charset="UTF-8">
		<title>胖先生:83604162</title>
		<script type="text/javascript">
    	
    	</script>
	</head>
	<body>
		<h2>A传递数据</h2>
		<form action="client06" method="post">
		  <input placeholder="账号" name="account"><br/>
		<input placeholder="姓名" name="user_name"><br/>
		<input placeholder="角色名称" name="role_name"><br/>
		  <input type="submit" value="提交数据">
		</form>
		
		
	</body>
</html>