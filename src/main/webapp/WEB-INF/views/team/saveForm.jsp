<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<h1>팀 등록</h1>
	<hr />
	<form action="/team/save" method="post">
		<input type="text" name="name" class="form-control" placeholder="팀 이름" />
		<select class="form-control" aria-label="Default select example" name="stadiumId">
			<option selected>선택하세요</option>
			<c:forEach var="stadium" items="${stadiums}">
				<option value="${stadium.id}">${stadium.name}</option>
			</c:forEach>
		</select><br /> 
		<button class="btn btn-primary">등록</button>
	</form>
</div>



</body>
</html>