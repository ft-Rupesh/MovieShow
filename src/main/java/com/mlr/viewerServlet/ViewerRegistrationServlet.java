package com.mlr.viewerServlet;

import java.io.IOException;

import com.mlr.viewerBean.ViewerBean;
import com.mlr.viewerDAO.ViewerRegistrationDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/signup")
public class ViewerRegistrationServlet extends HttpServlet
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
    	    String viewerName = req.getParameter("viewerName");
    	    Long viewerPhoneNo=Long.parseLong(req.getParameter("viewerPhoneNo"));
    	    String viewerEmail =req.getParameter("viewerEmail");
    	    String viewerGender=req.getParameter("viewerGender");
    	    String viewerLanguage=req.getParameter("viewerLanguage");
    	    String viewerLocation=req.getParameter("viewerLocation");
    	    
    	    ViewerBean vb=new ViewerBean();
    	    vb.setViewerName(viewerName);
    	    vb.setViewerPhoneNo(viewerPhoneNo);
    	    vb.setViewerEmail(viewerEmail);
    	    vb.setViewerGender(viewerGender);
    	    vb.setViewerLanguage(viewerLanguage);
    	    vb.setViewerLocation(viewerLocation);
    	    
    	    int k=new ViewerRegistrationDAO().insert(vb);
    	   
    	    if(k>0)
    	    {
    	         req.setAttribute("msg", "Registration Successfully .....");
    	         req.getRequestDispatcher("ViewerRegSuccess.jsp").forward(req, res);
    	    }else
    	    {
    	    	req.setAttribute("msg", "Registration failed....");
    	    	req.getRequestDispatcher("Msg.jsp").forward(req, res);
    	    }
    	     
    	 
    }
}
