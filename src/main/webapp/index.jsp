
<%@page import="com.progs.dao.UserDao"%>
<%@page import="com.progs.dbConnect.dbConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>


<html>
<head>
<meta charset="ISO-8859-1">

<title>::mfbs::</title>
<%@ include file="component/all_css.jsp"%>
<%@ include file="component/navbar.jsp"%>
<style type="text/css">
.back-img {
	background: url("Img/mfbs_bg_01.jpg");
	width: 100%;
	height: 80vh;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<div class="container-fluid back-img">
		<div class="text-center">
			<h1 class="text-white p-4">
				<i class="fa fa-book" aria-hidden="true"></i>..::: Microfinance
				Business System
			</h1>
		</div>
	</div>
	<%@ include file="component/footer.jsp"%>
<% Connection conn= dbConnect.getConn();
out.print(conn);
System.out.println(conn);


UserDao userdao=new  UserDao(dbConnect.getConn());
out.print(userdao.getUserInfo());
%>
</body>
</html>
