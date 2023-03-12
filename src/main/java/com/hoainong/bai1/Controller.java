package com.hoainong.bai1;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")
public class Controller extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/views/view_bai1/form.jsp");
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ModelTamGiac tamGiac = new ModelTamGiac();
		tamGiac.setA(Double.parseDouble(req.getParameter("A")));
		tamGiac.setB(Double.parseDouble(req.getParameter("B")));
		tamGiac.setC(Double.parseDouble(req.getParameter("C")));
		String messageString = "Không thỏa mãn các cạnh của một tam giác!";
		double a = tamGiac.getA() + tamGiac.getB();
		double b = tamGiac.getB() + tamGiac.getC();
		double c = tamGiac.getA() + tamGiac.getC();
		if ((a > tamGiac.getC()) && (b > tamGiac.getA()) && (c > tamGiac.getB())) {
			 String dt = req.getParameter("dientich");
			    if ("dien-tich".equals(dt))  {
				req.setAttribute("message","Diện Tích: " + tamGiac.DienTich() +"cm<sup>2</sup>");
			} else {
				req.setAttribute("message", "Chu vi: " + tamGiac.chuVi() +"cm");
			}

		} else {
			req.setAttribute("message", messageString);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/views/view_bai1/success.jsp");
		rd.forward(req, resp);
	}
	
}
