<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="screenshots/css/style.css">
 <link rel="stylesheet" href="screenshots/css/sys.css">
 <link rel="stylesheet" href="screenshots/css/manage.css">
<script type="text/javascript" src="screenshots/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="screenshots/js/admin-aside-bar.js"></script>
</head>
<body>
 <table border="1" cellpadding="0" cellspacing="0" >
		    <tr>
			  <td colspan="10" ><span id="title1">商品信息</span></td>
			</tr>
			<tr>
			   <th>ID</th>
			    <th>酒名：</th>
			     <th>酒精度:</th>
			      <th>口感：</th>
			       <th>进价</th>
			        <th>售价</th>
			         <th>库存数量：</th>
			          <th>供应商</th>
			            <th><a>删除</a></th>
			</tr>
			 <s:iterator value="#request.goodsList" id="goods">
			    <tr>
			      <td><s:property value="#goods.id"/></td>
			      <td><s:property value="#goods.goodsDesc"/></td>
			      <td><s:property value="#goods.degree"/></td>
			      <td><s:property value="#goods.palate"/></td>
			      <td><s:property value="#goods.price"/></td>
			      <td><s:property value="#goods.salePrice"/></td>
			      <td><s:property value="#goods.nums"/></td>
			      <td><s:property value="#goods.ghs"/></td>
			      <td><a  onclick="deleGoods(this)" id="${goods.id}" name="${goods.goodsDesc}" title="Goods">删除</a></td>
			     
			    </tr>
			 </s:iterator>
			</table>
</body>
</html>