package controller;

/**
 * @author - Aaron Barker
 * CIS175 - Fall 2021
 * Sept 23, 2021
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InputFormat;


@WebServlet("/getInputServlet")
public class getInputServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public getInputServlet() {
    	
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {

		String nA = request.getParameter("nounA");
		String nB = request.getParameter("nounB");
		String nC = request.getParameter("nounC");
		String aA = request.getParameter("adjA");
		
		InputFormat convertCase = new InputFormat(nA, nB, nC, aA);
		
		request.setAttribute("wordGroup", convertCase);
		
		getServletContext().getRequestDispatcher("/lib1.jsp")
			.forward(request, response);
	}

}
