package com.hoainong.bai3;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/bai3")
public class ControllerLoginbai3 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/view_bai3/form.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ModelInfobai3 dk = new ModelInfobai3();
//		dk.setName(req.getParameter("username"));
//		dk.setPassword(req.getParameter("password"));
//		dk.setGender(Boolean.parseBoolean(req.getParameter("gender")));
//		dk.setMarried((req.getParameter("married") != null));
//		dk.setCountry(req.getParameter("country"));
//		dk.setHobbies(req.getParameterValues("hobbies"));
//		dk.setNote(req.getParameter("notes"));
//		req.setAttribute("param", dk.getName());
//		req.setAttribute("param", dk.getPassword());
//		req.setAttribute("param", dk.isGender());
//		req.setAttribute("param", dk.isMarried());
//		req.setAttribute("param", dk.getCountry());
//		String str = Arrays.toString(dk.getHobbies());
//		req.setAttribute("paramValues", dk.getHobbies());
	
//		req.setAttribute("param", dk.getNote());
		RequestDispatcher rd = req.getRequestDispatcher("/views/view_bai3/result.jsp");
		rd.forward(req, resp);
	
		
	}
}
