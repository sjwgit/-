<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/logReg.css"/>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
 <script type="text/javascript" src="js/RegLog.js"></script> 
<title>国酒网注册</title>
</head>
<body style="background-image: url('imgs/register.jpg'); width:100%;height:100%;">
   <script type="text/javascript">
        function reg_reset(){
        	location.reload();
        }
   
   </script>
   <center>
   
       <h1>酒水网客户注册信息</h1>
       <s:form action="reg.action" method="post">
       <s:textfield name="user_name" label="用户名" id="user_name"></s:textfield><div id="div_user" class="type_div" style="margin-top:0"></div>
       <s:textfield name="name" label="昵称" id="name"></s:textfield><div id="div_name" class="type_div"style="margin-top: 27px;"></div>
        <s:password label="密码" name="password" id="password"></s:password><div id="div_pw" class="type_div" style="margin-top: 54px;"></div>
        <s:password label="再次输入密码 " name="password2" id="password2"></s:password><div id="div_pw2" class="type_div" style="margin-top: 81px;"></div>
        <s:radio list="{'男','女'}" name="sex" value="{'男'}" label="性别"></s:radio>
        <s:checkboxlist label="爱好" name="interests" list="{'读书','跑步','做饭','唱歌','跳舞'}" value="{'读书','跳舞'}"></s:checkboxlist>
        <s:select list="{'深圳','上海','广州','珠海','其它'}" headerKey="-1" headerValue="大连" label="目前所在地" name="city"></s:select>
        <s:textfield label="第二代身份证" name="idCard" id="idCard"></s:textfield><div id="div_idCard" class="type_div" style="margin-top: 175px;"></div>
        <s:textfield label="邮箱地址" name="email" id="email"></s:textfield><div id="div_email" class="type_div" style="margin-top: 207px;"></div>
        <s:textfield label="籍贯" name="jiguan" id="jiguan"></s:textfield><div id="div_jiguan" class="type_div" style="margin-top: 232px;"></div>
        <s:submit  value="提交" name="submit" id="register" style="width: 400px; margin-top: 10px;" ></s:submit>
        <s:reset value="重置" name="reset" id="register" onclick="reg_reset()"  style="width: 400px; margin-top: 10px;"></s:reset>
       </s:form>
        
   </center>
  
</body>
</html>