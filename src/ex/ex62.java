package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex62
 */
@WebServlet("/ex62")
public class ex62 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 奇数：リダイレクト
		// 偶数：フォワード
		int rand = (int) (Math.random() * 10);
		System.out.println(rand);
		if (rand % 2 == 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/forwarded.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/example/redirected.jsp");
		}
	}

}
