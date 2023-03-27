<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
	<span class="fs-4">Book Shop </span>
</a>
<ul class="nav nav-pills">
	<li class="nav-item"><a href="/" class="nav-link active" aria-current="page">Home</a></li>
	<c:if test="${member != null}">
		<li class="nav-item mt-2 mx-1"><a>환영합니다 ${member.name }님</a></li>
		<li class="nav-item"><a href="/sign/out" class="nav-link">Sign out</a></li>
	</c:if>
	<c:if test="${member == null}">
		<li class="nav-item"><a href="/sign/in" class="nav-link">Sign in</a></li>
		<li class="nav-item"><a href="/sign/up" class="nav-link">Sign up</a></li>
	</c:if>
	<li class="nav-item"><a href="about" class="nav-link">About</a></li>
</ul>