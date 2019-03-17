package atj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(description = "Serwlet Temperatura", urlPatterns = { "/MyServlet" })
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parameter1=request.getParameter("value1");
		String parameter2=request.getParameter("oper");
		if(parameter2.equals("cf")) {
		Double result=(((double)9/5)*Double.parseDouble(parameter1))+32.0;
		request.setAttribute("result", result);}
		else if(parameter2.equals("fc")) {
			Double result=((double)5/9)*(Double.parseDouble(parameter1)-32.0);
			request.setAttribute("result", result);
		}

		RequestDispatcher requestDispatcher	= 	request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
	}

}
