package com.github.zhangkaitao.shiro.chapter7.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

@WebServlet(name="vipShowServlet", urlPatterns="/vipshow")
public class VipShowServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("vip")) {
			req.setAttribute("subject", subject);
			req.getRequestDispatcher("/WEB-INF/jsp/vipInfo.jsp").forward(req, resp);
		}
	}

}
