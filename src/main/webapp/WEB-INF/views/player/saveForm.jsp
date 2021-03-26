<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>선수 등록</h1>
	<hr/>
	<form action="/player/save" method="post">
		<input type="text" name="name" class="form-control" placeholder="선수 이름"/><br/>
		<input type="text" name="position" class="form-control" placeholder="포지션"/><br/>
		<select class="form-control" aria-label="Default select example" name="teamId">
			<option selected>선택하세요</option>
			<c:forEach var="team" items="${teams}">
				<option value="${team.id}">${team.name}</option>
			</c:forEach>
		</select><br /> 
		<button class="btn btn-primary">등록</button>
	</form>
</div>



</body>
</html>