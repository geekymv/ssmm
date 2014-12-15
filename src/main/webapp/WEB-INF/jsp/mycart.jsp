<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.min.css"/>
<style type="text/css">
	.table {
		margin: 0 auto;
		width: 400px;	
	}
</style>

<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	function pay() {
		$.ajax({
			url: "pay",
			dataType: "text",
			success: function(data){
				alert(data);
				$(".d-cl").remove();
				$(".shop").before("<td>购物车中还没有任何商品！</td>");
				$(".pay").css("display","none");
			}
		});
	}
	
</script>

</head>
<body>
	
	<table class="table table-bordered table-condensed">
		<caption>我的购物车</caption>
		<c:choose>
			<c:when test="${empty carts }">
				<tr>
					<td>购物车中还没有任何商品！</td>
					<td><a href="list-dvd">继续购物</a></td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr class="d-cl">
				 <th>序号</th><th>名称</th> <th>价格</th> <th>数量</th> <th>小计</th> 
				</tr>
				
				<c:forEach items="${carts }" var="cart" varStatus="s">
				<tr class="d-cl">
					<td>${s.count }</td>	
					<td>${cart.dvd.name }</td>		
					<td>${cart.dvd.price }</td>		
					<td>${cart.buynum }</td>		
					<td>${cart.buynum * cart.dvd.price }</td>		
				</tr>	
			 	</c:forEach>
				<tr>
					<td colspan="5" class="d-cl">总计：${sum }元</td>
				</tr>			 
				<tr>
					<td colspan="2" class="shop"><a href="list-dvd">继续购物</a></td> <td colspan="3" class="pay"><a onclick="pay()">结账</a></td>
				</tr>
			
			</c:otherwise>
		</c:choose>
		
	
	</table>
	

		
	
</body>

















</html>