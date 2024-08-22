

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Inform
 */
@WebServlet("/Inform")
public class Inform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<h2>Form submitted sucessfully</h2>");
		out.println("<hr>");
		out.println("<p>RegNo :"+request.getParameter("regNo")+"</p>");
		out.println("<p>name :"+request.getParameter("name")+"</p>");
		out.println("<p>year :"+request.getParameter("year")+"</p>");
		out.println("<p>Gender :"+request.getParameter("gender")+"</p>");
		out.println("<p>DOB :"+request.getParameter("dob")+"</p>");
		out.println("<p>age :"+request.getParameter("age")+"</p>");
		out.println("<p>semester :"+request.getParameter("semester")+"</p>");
		
	}


}
