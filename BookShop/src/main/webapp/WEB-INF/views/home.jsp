<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"></script>

<!-- swiper -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />

<script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>

</head>
<body>
	<div class="container">
		<header class="d-flex flex-wrap justify-content-center py-3 border-bottom">
			<%@ include file="include/header.jsp"%>
		</header>
		<div class="p-4 p-md-5 text-white rounded bg-dark">
			<div class="col-md-6 px-0">
				<h1 class="display-4 fw-bold">BOOK STORE</h1>
			</div>
		</div>
		<nav class="d-flex justify-content-center py-3">
			<%@ include file="include/nav.jsp"%>
		</nav>

		<section>
			<span class="h2">추천 도서</span>
			<div class="d-flex justify-content-center align-items-center">
				<div class="swiper mySwiper">
					<div class="swiper-wrapper">
						<c:forEach var="row" items="${books}" varStatus="status">
							<div class="swiper-slide">
								<a href="book/detail?book_id=${row.book_id}">
									<img src="${row.book_img_thumb}" class="d-block w-100" style="width:300px; height:500px;" alt="...">
								</a>
							</div>
						</c:forEach>
					</div>
					<div class="swiper-button-next"></div>
					<div class="swiper-button-prev"></div>
					<div class="swiper-pagination"></div>
				</div>
			</div>
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
						<th scope="col" width="15%">국가</th>
						<th scope="col" width="15%">카테고리</th>
						<th scope="col" width="20%">가격</th>
						<th scope="col" width="10%">조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="row" items="${books}">
						<tr>
							<td>
								<a href="book/detail?book_id=${row.book_id}"> ${row.title} </a>
							</td>
							<td>${row.country}</td>
							<td>${row.category}</td>
							<td>
								<fmt:formatNumber type="number" maxFractionDigits="3" value="${row.price}" />
							</td>
							<td>${row.view_cnt}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<c:if test="${member.verify == 0 }">
				<div class="mb-3">
					<a class="btn btn-primary" href="book/create" role="button">생성</a>
				</div>
			</c:if>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="include/footer.jsp"%>
		</footer>
	</div>
	<script>
		var swiper = new Swiper(".mySwiper", {
			slidesPerView : 4,
			spaceBetween : 30,
			centeredSlides : true,
			autoplay : {
				delay : 2500,
				disableOnInteraction : true,
			},
			pagination : {
				el : ".swiper-pagination",
				clickable : true,
			},
			navigation : {
				nextEl : ".swiper-button-next",
				prevEl : ".swiper-button-prev",
			},
		});
	</script>
</body>
</html>
