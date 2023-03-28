<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	<div class="container">
		<header class="d-flex flex-wrap justify-content-center py-3 border-bottom">
			<%@ include file="../../include/header.jsp"%>
		</header>
		<div class="p-4 p-md-5 text-white rounded bg-dark">
			<div class="col-md-6 px-0">
				<h1 class="display-4 fw-bold">BOOK STORE</h1>
			</div>
		</div>
		<nav class="d-flex justify-content-center py-3">
			<%@ include file="../include/nav.jsp"%>
		</nav>

		<section class="row justify-content-center align-items-center">
			<table class="table">
				<thead>
					<tr>
						<th scope="col" width="5%">번호</th>
						<th scope="col" width="10%">이름</th>
						<th scope="col" width="10%">아이디</th>
						<th scope="col" width="10%">비밀번호</th>
						<th scope="col" width="20%">가입일</th>
						<th scope="col" width="10%">권한수준</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="row" items="${members}">
						<tr>
							<td>${row.member_id}</td>
							<td>${row.name}</td>
							<td>${row.user_id}</td>
							<td>${row.pass}</td>
							<td>
								<fmt:formatDate value='${row.insert_date}' pattern='yyyy.MM.dd HH:mm:ss' />
							</td>
							<td>${row.verify}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="../../include/footer.jsp"%>
		</footer>
	</div>
</body>
</html>