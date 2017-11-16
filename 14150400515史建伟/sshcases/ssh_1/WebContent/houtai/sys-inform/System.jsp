<%@page import="java.lang.management.ManagementFactory"%>
<%@page import="com.sun.management.OperatingSystemMXBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%
  String path= request.getContextPath();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="screenshots/css/style.css">
 <link rel="stylesheet" href="screenshots/css/sys.css">
<script type="text/javascript" src="screenshots/js/jquery-3.2.1.min.js"></script>
<title>System</title>
</head>
<body>
   <table border="1" cellpadding="0" cellspacing="0" >
		    <tr>
			  <td colspan="2" id="td2">系统基本信息</td>
			</tr>
			<tr>
			  <td id="td1">操作系统版本:</td>
			  <td id="td2">&nbsp;&nbsp; <%=System.getProperty("os.name")%>&nbsp;&nbsp;<%=System.getProperty("os.version")%></td>
			</tr>
			<tr>
			  <td id="td1">操作系统类型:</td>
			  <td id="td2">&nbsp;&nbsp; <%=System.getProperty("os.arch")%></td>
			</tr>
			<tr>
			  <td id="td1">临时目录:</td>
			  <td id="td2"><%=application.getRealPath("/") %></td>
			</tr>
			<tr>
			  <td id="td1">JDK版本:</td>
			  <td id="td2"><%=System.getProperty("java.version") %></td>
			</tr>
		     <tr>
			  <td id="td1">JDK安装目录:</td>
			  <td id="td2"><%=System.getProperty("java.home") %></td>
			</tr>
			<tr>
			  <td id="td1">总内存/剩余内存:</td>
			  <td id="td2"><% OperatingSystemMXBean os = (OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();%>
			               &nbsp;&nbsp;<%=os.getTotalPhysicalMemorySize()/1024/1024 %>MB/<%=os.getFreePhysicalMemorySize()/1024/1024 %>MB</td>
			</tr>
		 </table> 
		 
</body>
</html>