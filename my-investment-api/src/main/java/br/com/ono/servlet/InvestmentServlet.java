package br.com.ono.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/investment/api/list")
public class InvestmentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 7361467701408973890L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletResponse resp = response;
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write("[{\"name\":\"IBOVESPA\",\"value\":81675.42},{\"name\":\"AAPL\",\"value\":50032.38}]");
	}
}