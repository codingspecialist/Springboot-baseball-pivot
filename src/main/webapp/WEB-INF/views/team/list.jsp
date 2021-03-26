<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
	<h1>팀 리스트</h1>
	<hr/>
	<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀이름</th>
				<th>야구장이름</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="team" items="${teams}">
				<tr>
					<td>${team.id}</td>
					<td>${team.name}</td>
					<td>${team.stadium.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>