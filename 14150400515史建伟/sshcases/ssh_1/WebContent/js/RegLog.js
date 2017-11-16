 $(function() {
	
	
	
	
		
		 $("#register").click(function(){
			 
			 var user_name= $("#user_name").val();
			 var name= $("#name").val();
			 var password= $("#password").val();
			 var password2= $("#password2").val();
			 var email= $("#email").val();
			 var idCard= $("#idCard").val();
			 var jiguan= $("#jiguan").val();
			
				 if(user_name == ""){
					  document.getElementById("div_user").innerHTML="用户名不能为空.";
					     return false;
				  }
				  if(name == ""){
					  document.getElementById("div_name").innerHTML="昵称不能为空.";
					  return false;
				  }
				  if(password == ""){
					  document.getElementById("div_pw").innerHTML="密码不能为空.";
					  return false;
				  }
				  if(password2 == ""){
					  document.getElementById("div_pw2").innerHTML="再次输入密码不能为空.";
					  return false;
				  }
				  if(idCard == ""){
					  document.getElementById("div_idCard").innerHTML="身份证号不能为空.";
					  return false;
				  }
				  if(email == ""){
					  document.getElementById("div_email").innerHTML="邮箱不能为空.";
					  return false;
				  }
				 
				  if(jiguan == ""){
					  document.getElementById("div_jiguan").innerHTML="籍贯不能为空.";
					  return false;
				  }
				  
			       if(password != password2){
			    	   document.getElementById("div_pw").innerHTML="两次输入的密码不相同";
			    	   return false;
			       }
				     
				  return true;						
		 });
		 function login(){
			 alert("ddd");
		 }
			 
})