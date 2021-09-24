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


@WebServlet("/getInputServlet2")
public class getInputServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public getInputServlet2() {
    	
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {

		String nA = request.getParameter("nounA");
		String nB = request.getParameter("nounB");
		String vA = request.getParameter("verbA");

		
		InputFormat convertCase = new InputFormat(nA, nB, vA);
		
		request.setAttribute("wordGroup", convertCase);
		
		getServletContext().getRequestDispatcher("/lib2.jsp")
			.forward(request, response);
	}

}
