<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="screenshots/css/style.css">
 <link rel="stylesheet" href="screenshots/css/sys.css">
<script type="text/javascript" src="screenshots/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="screenshots/js/admin-aside-bar.js"></script>
<title>pass</title>
</head>
<body>

       <form action="houtai-update.action" method="post">
      
       <table border="1" cellpadding="0" cellspacing="0" >
		    <tr>
			  <td colspan="2" id="td2">修改密码</td>
			</tr>
			<tr>
			 <td id="td1">管理员</td>
			  <td id="td2"><s:property value="%{#session.admin.name}"/> </td>
			   <s:hidden name="username" value="%{#session.admin.name}"></s:hidden>
			</tr>
			<tr>
			 <td id="td1">原始密码  </td>
			  <td id="td2"><input type="text" id="password1"><div id="error-pass"></div> </td>
			  <s:hidden id="pass" value="%{#session.admin.password}"> </s:hidden>
			</tr>
			<tr>
			<tr>
			 <td id="td1">新密码</td>
			  <td id="td2"><input name="password" type="text" id="password2"> <div id="new-pass"></div> </td>
			</tr>
			
			</table>
			<input type="submit" value="提交" onclick="tijiao(event)" id="but1">
			<input type="reset" onclick="reset(event)" id="reset">
			 </form> 
</body>
</html>