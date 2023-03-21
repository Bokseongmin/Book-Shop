<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<form method="POST">
				<div class="mb-3">
					<label for="name" class="form-label">이름</label>
					<input type="text" class="form-control" id="name">
				</div>
				<div class="mb-3">
					<label for="user_id" class="form-label">이름</label>
					<input type="text" class="form-control" id="user_id" name="user_id">
				</div>
				<div class="mb-3">
					<label for="pass" class="form-label">이름</label>
					<input type="text" class="form-control" id="pass" name="pass">
				</div>
				<div class="mb-3">
					<input type="submit" class="form-control" id="pass" name="저장">
				</div>
			</form>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="../includes/footer.jsp"%>
		</footer>
	</div>
</body>
</html>