<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>선수 리스트</h1>
	<hr/>
		<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수이름</th>
				<th>선수포지션</th>
				<th>팀이름</th>
				<th>야구장이름</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${players}">
				<tr>
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.position}</td>
					<td>${player.team.name}</td>
					<td>${player.team.stadium.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>