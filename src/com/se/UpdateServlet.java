package com.se;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		int paramid=Integer.parseInt(req.getParameter("paramid"));
		TempDao td= new TempDao();
		ArrayList list= td.update(paramid);
		
	req.setAttribute("list", list);
	RequestDispatcher rd= req.getRequestDispatcher("secondupdate.jsp");
	rd.forward(req, res);
	
	}
		
		
	};

