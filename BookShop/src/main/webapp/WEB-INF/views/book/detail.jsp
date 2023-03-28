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
			<%@ include file="../include/header.jsp"%>
		</header>
		<div class="p-4 p-md-5 text-white rounded bg-dark">
			<div class="col-md-6 px-0">
				<h1 class="display-4 fw-bold">BOOK STORE</h1>
			</div>
		</div>
		<nav class="d-flex justify-content-center py-3">
			<%@ include file="../include/nav.jsp"%>
		</nav>

		<section>
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<form>
							<fieldset disabled>
								<div class="mb-3">
									<label for="title" class="form-label">제목</label>
									<input type="text" id="title" class="form-control" placeholder="${book.title }">
								</div>
								<div class="mb-3">
									<label for="country" class="form-label">국가</label>
									<input type="text" id="country" class="form-control" placeholder="${book.country }">
								</div>
								<div class="mb-3">
									<label for="category" class="form-label">카테고리</label>
									<input type="text" id="category" class="form-control" placeholder="${book.category }">
								</div>
								<div class="mb-3">
									<label for="price" class="form-label">가격</label>
									<input type="text" id="price" class="form-control" placeholder="<fmt:formatNumber type='number' maxFractionDigits='3' value='${book.price }' />">
								</div>
								<div class="mb-3">
									<label for="date" class="form-label">작성일</label>
									<input type="text" id="date" class="form-control" placeholder="<fmt:formatDate value='${book.insert_date}' pattern='yyyy.MM.dd HH:mm:ss' />">
								</div>
								<div class="mb-3">
									<label for="view_cnt" class="form-label">재고</label>
									<input type="text" id="stock" class="form-control" placeholder="${book.stock }">
								</div>
								<div class="mb-3">
									<label for="view_cnt" class="form-label">조회수</label>
									<input type="text" id="view_cnt" class="form-control" placeholder="${book.view_cnt }">
								</div>
							</fieldset>
						</form>
					</div>
					<div class="col-md-6">
						<img class="img-thumbnail" src="${book.book_img }" alt="...">
					</div>
				</div>
			</div>
			<div class="d-flex justify-content-center">
				<c:if test="${member.verify == 0 }">
					<a class="btn btn-primary me-3" href="update?book_id=${book.book_id }">수정</a>
					<form action="delete" method="POST">
						<input type="hidden" name="book_id" value="${book.book_id}" />
						<input class="btn btn-primary" type="submit" value="삭제" />
					</form>
				</c:if>
				<a class="btn btn-primary ms-3" href="list">목록으로</a>
			</div>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="../include/footer.jsp"%>
		</footer>
	</div>
</body>
</html>