package com.hoainong.bai4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/hoai/nong")
public class HitCounterServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	int count;
	Path path = Paths.get("D:/DUAN/count.txt");
	@Override
	public void init() throws ServletException {
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (NumberFormatException | IOException e) {
		
			e.printStackTrace();
		}
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		count++;
		arg0.setAttribute("count", count);
		arg0.getRequestDispatcher("/views/view_bai4/hit-counter.jsp").forward(arg0, arg1);
	}
	@Override
	public void destroy() {
		try {
			Files.write(path, String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
