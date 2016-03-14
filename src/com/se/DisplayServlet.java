package com.se;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
	String paramid =req.getParameter("paramid");
	
	
	
	
	
	
	TempDao td=new TempDao();
	
	ArrayList list= td.display(paramid);
	req.setAttribute("list", list);
	System.out.println("data display");
	RequestDispatcher rd= req.getRequestDispatcher("totaldisplay.jsp");
	rd.forward(req, res);
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

}
