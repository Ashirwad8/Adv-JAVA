package in.mark1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TrialForm extends GenericServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("n1");
		String email = req.getParameter("email");
		String password = req.getParameter("pd");
		String gender = req.getParameter("gen");
		String address = req.getParameter("addrs");
		String hobbies = req.getParameter("ch");
		String dob = req.getParameter("dob");
		
	
		
		
		out.println("Name : " + name);
		out.println("E-mail : " + email);
		out.println("Password : " + password);
		out.println("Gender : " + gender);
		out.println("Address : " + address);
		out.println("Hobbies : " + hobbies);
		out.println("Date of birth : " + dob);
		
		
		
		

	}

}
