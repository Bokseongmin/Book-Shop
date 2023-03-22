package com.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring.vo.MemberVo;

public class AdminInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
		
		HttpSession session = req.getSession();
		MemberVo member = (MemberVo)session.getAttribute("member");
		
		if(member == null) {
			res.sendRedirect("/sign/in");
			return false;
		}
		if (member.getVerify() != 0) {
			res.sendRedirect("/");
			return false;
		}
		return true;
	}

}
