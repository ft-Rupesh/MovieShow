package com.mlr.viewerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mlr.DBConnection.DBConnection;
import com.mlr.viewerBean.ViewerBean;

public class ViewerRegistrationDAO 
{
   public int k=0;
   
   public int insert(ViewerBean vb)
   {
	   try
	   {
		   Connection con=DBConnection.getMyConnection();
		   PreparedStatement ps=con.prepareStatement
		   ("insert into MovieViewer values(?,?,?,?,?,?)");
		   
		   ps.setString(1, vb.getViewerName());
		   ps.setLong(2, vb.getViewerPhoneNo());
		   ps.setString(3, vb.getViewerEmail());
		   ps.setString(4, vb.getViewerGender());
		   ps.setString(5, vb.getViewerLanguage());
		   ps.setString(6, vb.getViewerLocation());
		   k = ps.executeUpdate();
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return k;
   }
}
