package displayoddeven;



import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Prime extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Prime() {
       
    }
    public void init(ServletConfig config) throws ServletException {
		
	}
    public void destroy() {

	}
    public ServletConfig getServletConfig() {
		
		return null;
	}
    public String getServletInfo() {
		
		return null; 
	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String abc=request.getParameter("num");
		int n=Integer.parseInt(abc);
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			out.println(n+ "is not Prime number");
		}
		else 
		{
			for(i=2;i<m;i++) {
				if(n%i==0) {
					out.println(n+"is not prime number");
					flag=1;
					break;
				}
				if(flag==0) {
					out.println(n+ "is prime number");
				}
			}
		}
	}

}
