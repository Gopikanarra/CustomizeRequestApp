import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class GoodWordFilter
 */
@WebFilter("/MyServlet")
public class GoodWordFilter extends HttpFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("preprocessing of filter");
		RequestCustomizing req1=new RequestCustomizing((HttpServletRequest)request);
		// pass the request along the filter chain
		chain.doFilter(req1, response);
		System.out.println("Post processing logic of filter");
	}
	public void destroy() {
		
	}

}
