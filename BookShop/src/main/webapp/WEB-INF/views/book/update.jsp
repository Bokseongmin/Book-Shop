<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>책 생성</h1>
	<form method="POST">
		<p>
			제목 : <input type="text" name="title" value="${book.title }" />
		</p>
		<p>
			카테고리 : <input type="text" name="category" value="${book.category }" />
		</p>
		<p>
			가격 : <input type="text" name="price" value="${book.price }" />
		</p>
		<p>
			<input type="submit" name="저장" />
		</p>
	</form>
</body>
</html>