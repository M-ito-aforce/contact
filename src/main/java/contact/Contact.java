package contact;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/jsp/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");
		String company = request.getParameter("company");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String option = request.getParameter("option");
		String document = request.getParameter("document");

		Page.header(out);

		out.println(user);
		out.println(company);
		out.println(email);
		out.println(contact);
		out.println(option);
		
		/*if (document !=null)*/
		
		if ("Yes".equals(document)) { 
		    request.setAttribute("user", user);
		    request.setAttribute("company", company);
		    request.setAttribute("email", email);
		    request.setAttribute("contact", contact);
		    request.setAttribute("option", option);

		    request.getRequestDispatcher("/jsp/Thanks.jsp").forward(request, response);
		}

		
		Page.footer(out);
	}
	
}