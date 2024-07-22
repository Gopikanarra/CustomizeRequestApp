import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestCustomizing extends HttpServletRequestWrapper {
	public RequestCustomizing(HttpServletRequest request) {
		super(request);
	}
	@Override
	public String getParameter(String word) {
		String word1=super.getParameter(word);
		System.out.println(word1);
		if(word1.equals("apple")||word1.equals("banana")||word1.equals("orange")||word1.equals("grapes"))
			return "fruits";
		else
			return word1;
	}
}
