<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>야구장 등록</h1>
	<hr/>
	<form action="/stadium/save" method="post">
		<input type="text" name="name" class="form-control" placeholder="야구장 이름"/><br/>
		<button class="btn btn-primary">등록</button>
	</form>
</div>



</body>
</html>