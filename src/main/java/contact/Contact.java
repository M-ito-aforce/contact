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
@WebServlet("/jsp/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Page.header(out);
		
		request.setCharacterEncoding("UTF-8");
		String user=request.getParameter("user");
		String company=request.getParameter("company");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String option=request.getParameter("option");
		String [] document = request.getParameterValues("document");
		
		if (document !=null)
		for (String item : document) {
			if ("Yes".equals(item)) 
		
			 out.println(user);
			 out.println(company);
			 out.println(email);
			 out.println(contact);
			 out.println(option);
			 request.setAttribute("user", user);
				request.setAttribute("company", company);
				request.setAttribute("email", email);
				request.setAttribute("contact", contact);
				request.setAttribute("option", option);

				// 資料請求希望かを判定（Yesが含まれているか）
				boolean requestedDocument = false;
				if (option != null) {
					for (String opt : option) {
						if ("Yes".equals(opt)) {
							requestedDocument = true;
							break;
						}
					}
				}

				if (requestedDocument) {
					request.getRequestDispatcher("/jsp/Thanks.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("/jsp/Submit.jsp").forward(request, response);
				}
			}
		}