package displayoddeven;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Substractionofnum extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Substractionofnum() {
     
    }
    public void init(ServletConfig config) throws ServletException {
	
	}
	public void destroy() {
		
	}
	public String getServletInfo() {
	
		return null; 
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sub = num1 - num2;
		
		PrintWriter out = response.getWriter();
		out.println("Substraction :"+sub);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
