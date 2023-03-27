<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<ul class="nav nav-pills">
	<li class="nav-item"><a href="/book/list" class="nav-link">전체 목록</a></li>
	<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" aria-expanded="false">국내 만화</a>
		<ul class="dropdown-menu dropdown-menu-dark">
			<li><a class="dropdown-item" href="/country/kr">전체</a></li>
			<li><a class="dropdown-item" href="/country/kr?category=thriller">스릴러</a></li>
			<li><a class="dropdown-item" href="/country/kr?category=action">액션</a></li>
			<li><a class="dropdown-item" href="/country/kr?category=fantasy">판타지</a></li>
		</ul>
	</li>
	<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" aria-expanded="false">일본 만화</a>
		<ul class="dropdown-menu dropdown-menu-dark">
			<li><a class="dropdown-item" href="/country/jp">전체</a></li>
			<li><a class="dropdown-item" href="/country/jp?category=thriller">스릴러</a></li>
			<li><a class="dropdown-item" href="/country/jp?category=action">액션</a></li>
			<li><a class="dropdown-item" href="/country/jp?category=fantasy">판타지</a></li>
		</ul>
	</li>
	<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown" aria-expanded="false">미국 만화</a>
		<ul class="dropdown-menu dropdown-menu-dark">
			<li><a class="dropdown-item" href="/country/us">전체</a></li>
			<li><a class="dropdown-item" href="/country/us?category=thriller">스릴러</a></li>
			<li><a class="dropdown-item" href="/country/us?category=action">액션</a></li>
			<li><a class="dropdown-item" href="/country/us?category=fantasy">판타지</a></li>
		</ul>
	</li>
</ul>