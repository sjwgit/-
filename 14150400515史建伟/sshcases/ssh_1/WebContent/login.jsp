<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
   String path = request.getContextPath();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/logReg.css"/>
<title>国酒网登陆</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
 <script type="text/javascript" src="js/RegLog.js"></script> 

</head>
<script type="text/javascript">
     function login(event){
    	
    	 event.preventDefault();
    	 var username =$("#username").val();
    	 var pw =$("#pw").val();
    	
    	  if(username =="" || pw ==""){
    		
    		  document.getElementById("div1").innerHTML="用户名或密码不正确";
    		 
    	  }else{
    		  window.event.returnValue = true;
    		 /*  document.getElementById("login").submit(); */
    	  } 
     }
      function register(event) {
    	
    	  event.preventDefault();
    	  window.location.href="./register.jsp"
	} 
  
</script>
<body style="background-image: url('imgs/login.jpg'); width:100%;height:100%;">
        <center>
         
        <h1>国酒网上商城后台管理</h1>
        <s:form action="houtai-login.action" method="post" validate="true" id="form-position">
           <div id="div1"></div>
          <s:textfield name="name" label="用户名" id="username" style="width:300px;"></s:textfield>
           
          <s:textfield name="password" label="密码" id="pw" style="width:300px;"></s:textfield>
          <s:submit type="image" value="登陆" id="login" src="imgs/submit.png" onclick="login(event)" ></s:submit>
          <s:submit type="image" value="注册" id="register" src="imgs/reg_logo.png" onclick="register(event)" ></s:submit>
            
        </s:form>
        </center>
       
</body>
</html>