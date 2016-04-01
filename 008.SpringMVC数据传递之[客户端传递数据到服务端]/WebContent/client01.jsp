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
		<a href="client01?id=-999">传递一个数据</a><br/>
		<a href="client02?id=1000&name=tomcat">传递2个数据</a><br/>
		<a href="client03?id=888&name=shxt">传递2个数据</a><br/>
		
		<hr>
		<h2>测试复选框</h2>
		<form action="client04" method="post">
		  <input type="checkbox" name="hobbys" value="basketball">篮球&nbsp;
		  <input type="checkbox" name="hobbys" value="football">足球&nbsp;
		  <input type="checkbox" name="hobbys" value="volleyball">排球&nbsp;
		  <input type="checkbox" name="hobbys" value="pingpang">乒乓&nbsp;
		  <input type="submit" value="提交数据">
		</form>
		<h2>测试多选列表</h2>
		<form action="client05" method="post">
		  <select name="clazz" multiple="multiple" size="10">
		      <option value="jinxiu">锦绣</option>
		      <option value="xiangyun">祥云</option>
		      <option value="chaoyue">超越</option>
		  </select>
		  <input type="submit" value="提交数据">
		</form>
		
	</body>
</html>