<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Baseball</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<a class="navbar-brand" href="/stadium/saveForm">Baseball</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/stadium/saveForm">야구장등록</a></li>
				<li class="nav-item"><a class="nav-link" href="/team/saveForm">팀등록</a></li>
				<li class="nav-item"><a class="nav-link" href="/player/saveForm">선수등록</a></li>
				<li class="nav-item"><a class="nav-link" href="/stadium/list">야구장리스트</a></li>
				<li class="nav-item"><a class="nav-link" href="/team/list">팀리스트</a></li>
				<li class="nav-item"><a class="nav-link" href="/player/list">선수리스트</a></li>
				<li class="nav-item"><a class="nav-link" href="/player/positionList">포지션별 선수리스트</a></li>
			</ul>
		</div>
	</nav>
	<br>