package com.se;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void service (HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		int paramid=Integer.parseInt(req.getParameter("paramid"));
		TempDao td= new TempDao();
		td.delete(paramid);
		System.out.println("deleted data");
    
	}
    
    
}
