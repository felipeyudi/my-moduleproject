package br.com.ono.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="creditcard/api/list")
public class CreditcardServlet extends HttpServlet {
	
	private static final long serialVersionUID = 7361467701408973890L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletResponse resp = response;
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write("[{\"cardName\":\"MY T X TEST\",\"cardNumber\":\"8167.XXX.XXX.1122\",\"validDate\":\"02/27\"}]");
	}
}