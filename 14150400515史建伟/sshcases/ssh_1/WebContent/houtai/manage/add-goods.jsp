<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="screenshots/css/style.css">
<link rel="stylesheet" href="screenshots/css/goods.css">
<link rel="stylesheet" href="screenshots/css/sys.css">
<script type="text/javascript" src="screenshots/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="screenshots/js/admin-aside-bar.js"></script>
<title>商品添加</title>
</head>

<body>
         <form  action="uploadImg.action" method="post" enctype="multipart/form-data" >
        <table border="1" cellpadding="0" cellspacing="0" >
		    <tr>
			  <td colspan="2" id="td2">添加商品</td>
			</tr>
			<tr>
			  <td id="td1">上传文件:</td>
			  <td id="td2">  <input type="file" name="upImg" value="dfdf"></td>
			</tr>
			<tr>
			  <td id="td1">描述:</td>
			  <td id="td2"><input type="text" name="goodsDesc" id="goodsDesc">
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			<tr>
			  <td id="td1">酒精度:</td>
			  <td id="td2"><input type="text" name="degree" id="degree">
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			<tr>
			  <td id="td1">口感:</td>
			  <td id="td2"><input type="text" name="palate" id="palate">
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			<tr>
			  <td id="td1">进价</td>
			  <td id="td2"><input type="text" name="price" id="price" >
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			<tr>
			  <td id="td1">售价</td>
			  <td id="td2"><input type="text" name="salePrice" id="salePrice" >
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			<tr>
			  <td id="td1">数量:</td>
			  <td id="td2"><input type="text" name="nums" id="nums" >
                  <span style="color:red;">(*必填)</span></td>
			</tr>
		     <tr>
			  <td id="td1">供货商:</td>
			  <td id="td2"><input type="text" name="ghs" id="ghs" >
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			 <tr>
			  <td id="td1">产地:</td>
			  <td id="td2"> <input type="text" name="address" id="address" >
                  <span style="color:red;">(*必填)</span></td>
			</tr>
			 <tr>
			    <td colspan="2" style="margin-left: 30%;" ><input type="submit" value="提交" id="sub"></td>
			 </tr>
		 </table> 
		</form> 
</body>
</html>