package com.se;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataStoreServlet
 */
@WebServlet("/DataStoreServlet")
public class DataStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
	int clientid =Integer.parseInt(req.getParameter("clientid"));
	String unitid=req.getParameter("unitid");
	String tempval=req.getParameter("tempval");
	
	Date d=new Date();
	String dom=d.toString();
	
	Bean b= new Bean();
	b.setClientid(clientid);
	b.setUnitid(unitid);
	b.setTempval(tempval);
	b.setDom(dom);
	
	TempDao td=new TempDao();
	td.insert(b);
	System.out.println("data strd");
		
	}
	

}
