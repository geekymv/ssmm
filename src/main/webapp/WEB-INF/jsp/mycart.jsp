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
	<h3>我的购物车</h3>
	<table>
		<c:choose>
			<c:when test="${empty carts }">
				购物车中还没有任何商品！
			</c:when>
			<c:otherwise>
				<tr>
				 <th>序号</th><th>名称</th> <th>价格</th> <th>数量</th> <th>小计</th> 
				</tr>
				
				<c:forEach items="${carts }" var="cart" varStatus="s">
				<tr>
					<td>${s.index }</td>	
					<td>${cart.dvd.name }</td>		
					<td>${cart.dvd.price }</td>		
					<td>${cart.buynum }</td>		
					<td>${cart.buynum * cart.dvd.price }</td>		
				</tr>	
			 	</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	
	
	
</body>
</html>