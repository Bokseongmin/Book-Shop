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
			<%@ include file="../includes/header.jsp"%>
		</header>
		<div class="p-4 p-md-5 text-white rounded bg-dark">
			<div class="col-md-6 px-0">
				<h1 class="display-4 fw-bold">BOOK STORE</h1>
			</div>
		</div>
		<nav class="d-flex justify-content-center py-3">
			<%@ include file="../includes/nav.jsp"%>
		</nav>

		<section>
			<form>
				<div class="mb-3">
					<label for="search" class="form-label">검색</label>
					<input class="form-control" type="text" name="keyword" id="search" value="${keyword}" >
				</div>
				<input class="btn btn-primary" type="submit" value="검색" />
			</form>
			<table class="table">
				<thead>
					<tr>
						<th scope="col" width="40%">제목</th>
						<th scope="col" width="20%">국가</th>
						<th scope="col" width="20%">카테고리</th>
						<th scope="col" width="20%">가격</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="row" items="${books}">
						<tr>
							<td><a href="/book/detail?book_id=${row.book_id}"> ${row.title}
							</a></td>
							<td>${row.country}</td>
							<td>${row.category}</td>
							<td><fmt:formatNumber type="number" maxFractionDigits="3"
									value="${row.price}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<c:if test="${member.verify == 0 }">
				<div class="mb-3">
					<a class="btn btn-primary" href="create" role="button">생성</a>
				</div>
			</c:if>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="../includes/footer.jsp"%>
		</footer>
	</div>
</body>
</html>