package com.telusco;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet{	
  public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException {
    int a =Integer.parseInt(req.getParameter("num1"));
	int b= Integer.parseInt(req.getParameter("num2"));
	int c=Integer.parseInt(req.getParameter("op"));
	float d;
	int k;
	PrintWriter out=res.getWriter();
	switch(c)
	{
	       case 1:
	       out.println("the sum of "+a+" and "+b+" is "+(a+b)) ;
           break;
	       case 2:
		   out.println("the substraction  of "+a+" and "+b+" is "+(a-b)) ;
	       break;	
	       case 3:
		   out.println("the multiplication of "+a+" and "+b+" is "+(a*b)) ;
		   break;
	       case 4:
		   d=a/b;
		   out.println("the Division of "+a+" and "+b+" is "+d) ;
	       break;
	       case 5:
	    	    k=a+b;
	    	   out.println("square of sum of "+a+"and "+b+"is \n");
	    	   
	    	   req.setAttribute("k", k);
	    		RequestDispatcher rd=req.getRequestDispatcher("sq");
	    		rd.include(req, res);
	    		break;
	}
	//PrintWriter out=res.getWriter();
	//out.println("the sum of "+i+" and "+j+" is "+k) ;
}
}	
