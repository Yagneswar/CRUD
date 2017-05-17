<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

				
		<form:form action="${contextPath}/admin/insert" method="post" modelAttribute="product">
		
			<form:hidden path="id"/> 
			
			<hr/>		
			<form:input path="brand"/>
			
			<hr/>
			
			<form:input path="category"/>
			
			<hr/>
				
			
			<form:input path="name"/>
			
			<hr/>	
			
			<input type="submit" value="Save"/>
									
		</form:form>	
	
<table>
	<tr>
		<th>Id</th>
		<th>Brand</th>
		<th>Category</th>
		<th>Name</th>
		<th>&#160;</th>
	</tr>

	<c:forEach items="${products}" var="product">	
		<tr>
			<td>${product.id}</td>
			<td>${product.brand}</td>
			<td>${product.category}</td>
			<td>${product.name}</td>
			<td>				
				<a href="${contextPath}/admin/edit/${product.id}">Edit</a>&#160;
				<a href="${contextPath}/admin/delete/${product.id}">Delete</a>			
			</td>		
		</tr>
	</c:forEach>


</table>
