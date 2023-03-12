package com.hoainong.bai2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/home-index")
public class ControllerLogin extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/view_bai2/form.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ModelInfo dk = new ModelInfo();
//		dk.setName(req.getParameter("username"));
//		dk.setPassword(req.getParameter("password"));
//		dk.setGender(Boolean.parseBoolean(req.getParameter("gender")));
//		dk.setMarried((req.getParameter("married") != null));
//		dk.setCountry(req.getParameter("country"));
//		dk.setNote(req.getParameter("notes"));
//		req.setAttribute("param", dk.getName());
//		req.setAttribute("param", dk.getPassword());
//		req.setAttribute("param", dk.isGender());
//		req.setAttribute("param", dk.isMarried());
//		req.setAttribute("param", dk.getCountry());
//		req.setAttribute("param", dk.getNote());
		RequestDispatcher rd = req.getRequestDispatcher("/views/view_bai2/result.jsp");
		rd.forward(req, resp);
		
	}
}
