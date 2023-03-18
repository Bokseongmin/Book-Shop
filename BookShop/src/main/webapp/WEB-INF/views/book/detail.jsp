<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세</h1>
	<p>제목 : ${book.title }</p>
	<p>카테고리 : ${book.category }</p>
	<p>
		가격 :
		<fmt:formatNumber type="number" maxFractionDigits="3"
			value="${book.price }" />
	</p>
	<p>
		작성일 :
		<fmt:formatDate value="${book.insert_date}"
			pattern="yyyy.MM.dd HH:mm:ss" />
	</p>
	<p>
		<a href="update?book_id=${book.book_id }">수정</a>
	</p>
	<form action="delete" method="POST">
		<input type="hidden" name="book_id" value="${book.book_id}" /> 
		<input type="submit" value="삭제" />
	</form>
	<p>
		<a href="list">목록으로</a>
	</p>
</body>
</html>