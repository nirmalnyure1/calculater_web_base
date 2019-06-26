package com.telusco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	 public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	  {
	    
		
        //int k =Integer.parseInt(req.getParameter("k"));
		PrintWriter out1=res.getWriter();
		int k= (int) req.getAttribute("k");
		k=k*k;
		
	  
		
		out1.println(" "+k) ;
	}
}
