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
			<p>제목 : ${book.title }</p>
			<p>카테고리 : ${book.category }</p>
			<p>
				가격 :
				<fmt:formatNumber type="number" maxFractionDigits="3" value="${book.price }" />
			</p>
			<p>
				작성일 :
				<fmt:formatDate value="${book.insert_date}" pattern="yyyy.MM.dd HH:mm:ss" />
			</p>
			<p>
				<a href="update?book_id=${book.book_id }">수정</a>
			</p>
			<form action="delete" method="POST">
				<input type="hidden" name="book_id" value="${book.book_id}" /> <input type="submit" value="삭제" />
			</form>
			<p>
				<a href="list">목록으로</a>
			</p>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="../includes/footer.jsp"%>
		</footer>
	</div>
</body>
</html>