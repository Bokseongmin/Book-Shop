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
			<form role="form" method="POST" autocomplete="off" enctype="multipart/form-data">
				<div class="mb-3">
					<label for="title" class="form-label">Title</label>
					<input class="form-control" type="text" name="title" id="title">
				</div>
				<div class="mb-3">
					<label for="country" class="form-label">Country</label>
					<select class="form-select" aria-label="Default select" name="country" id="country">
						<option selected>선택</option>
						<option value="kr">한국</option>
						<option value="jp">일본</option>
						<option value="us">미국</option>
					</select>
				</div>
				<div class="mb-3">
					<label for="category" class="form-label">Category</label>
					<select class="form-select" aria-label="Default select" name="category" id="category">
						<option selected>선택</option>
						<option value="thriller">스릴러</option>
						<option value="action">액션</option>
						<option value="fantasy">판타지</option>
					</select>
				</div>
				<div class="mb-3">
					<label for="price" class="form-label">Price</label>
					<input class="form-control" type="text" name="price" id="price">
				</div>
				<div class="mb-3">
					<label for="price" class="form-label">재고</label>
					<input class="form-control" type="text" name="stock" id="stock">
				</div>
				<div class="mb-3">
					<label for="formFile" class="form-label">표지</label>
					<input class="form-control" type="file" name="file" id="book_img" accept="image/jpg, image/png, image/gif">
				</div>
				<div class="mb-3">
					<div class="select_img">
						<img src="" class="img-thumbnail" alt="..."/>
					</div>
				</div>

				<%=request.getRealPath("/")%>
				<p>
					<input type="submit" name="저장" />
				</p>
			</form>
		</section>

		<footer class="py-3 my-4">
			<%@ include file="../include/footer.jsp"%>
		</footer>
	</div>
	<script>
		$("#book_img")
				.change(
						function() {
							if (this.files && this.files[0]) {
								var reader = new FileReader;
								reader.onload = function(data) {
									$(".select_img img").attr("src",
											data.target.result).width(500);
								}
								reader.readAsDataURL(this.files[0]);
							}
						});
	</script>
</body>
</html>