<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>포지션별 선수 리스트</h1>
	<hr/>
	<table class="table">
		<thead>
			<tr>
				<th>포지션</th>
				<th>LG</th>
				<th>롯데</th>
				<th>삼성</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${dtos}">
				<tr>
					<td>${dto.position}</td>
					<td>${dto.lg}</td>
					<td>${dto.lotte}</td>
					<td>${dto.samsung}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>