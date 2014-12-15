<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	function addCart(id) {
		$.ajax({
			url: "add-cart",
			data: {"id": id},
			dataType: "text",
			success: function(data){
				alert(data);
			}
		});
	}
	
</script>

</head>
<body>
	欢迎${user.loginId }的到来！
	<h3><a href="mycart">我的购物车</a></h3>
	<h1>商品列表</h1>
	
	<table>
		<tr>
			<th>名称</th> <th>价格</th> <th>操作</th> 
		</tr>
		
		<c:forEach items="${dvds }" var="dvd">
		<tr>
			<td>${dvd.name }</td>		
			<td>${dvd.price }</td>		
			<td><a style="cursor: pointer;" onclick="addCart(${dvd.id})">加入购物车</a></td>		
		</tr>	
		</c:forEach>
		
	</table>
	
	
</body>
</html>