package com.iqbal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iqbal.bean.Search;
import com.iqbal.dao.SearchDao;
import com.tektaurus.bean.Student;
import com.iqbal.dao.SearchDao;

@WebServlet("/Search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   SearchDao dao;
	   Search s;
	   PrintWriter out;
	   public SearchServlet() {

	       dao=new SearchDao();
	    }


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	out=response.getWriter();
	int id=Integer.parseInt(request.getParameter("id"));	

	int ra=dao.insert(s);
	if(ra>0)
		out.println("<font color=green>Student Details Inserted Succcessfully.</font>");
	else
		out.println("<font color=red>Student Details are not inserted.</font>");
	out.println("To Go Back To The Form <a href='http://localhost:9090/StudentManagementSystem/home.html'>Click Here</a>");
		
}
}