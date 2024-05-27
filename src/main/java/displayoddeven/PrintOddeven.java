package displayoddeven;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintOddeven extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PrintOddeven() {
    }
    public void init(ServletConfig config) throws ServletException {
		
	}
	public void destroy() {
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		PrintWriter out =response.getWriter();
		int sum = 0;
		for(int i = 1;i<=2;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		out.print("<b>The sum is :</br>"+sum);
	}

}
