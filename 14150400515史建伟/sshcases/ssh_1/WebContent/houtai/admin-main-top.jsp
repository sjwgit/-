<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="screenshots/css/style.css">
<link rel="stylesheet" href="screenshots/css/admin-login-top.css">
<script type="text/javascript" src="screenshots/js/jquery-3.2.1.min.js"></script>
<title>Insert title here</title>
</head>
<script>
setInterval("clock.innerHTML=new Date().toLocaleString()+'&nbsp;&nbsp;'+''.charAt(new Date().getDay());",1000)
</script>
<body>
   <header class="header">
		          <div id="div" class="left">
			           <span id="span1">国酒商城后台管理</span>
			      </div>
			        <div id="div1">
			         <span id="clock"></span>
			     </div>
			       <div id="div2">
			         <span>您好，系统管理员</span>
			     </div>
			       
			   
		  </header>
</body>
</html>