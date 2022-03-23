package componentes.exemplos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet 
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// @Override
	protected void service2 (ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		((HttpServletRequest) req).getSession().setAttribute("nomeUSER", "CARLOS MANUEL");
		req.getRequestDispatcher("questoes-prova.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userNome = req.getParameter("nomeusuario");
		System.out.println(userNome);
		
	}

}
