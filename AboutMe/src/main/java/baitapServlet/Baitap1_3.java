package baitapServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Baitap1_3
 */
@WebServlet("/Baitap1_3")
public class Baitap1_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter traVe = response.getWriter();
		traVe.append("Bạn đã gửi yêu cầu Get!");
		String noiDungHTML = "<div class=\"container\">\r\n"
				+ "        <h1>Thông tin cá nhân</h1>\r\n"
				+ "        <ul>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Họ và tên:</label> Truong\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Ngày sinh:</label> 05/01/204\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Địa chỉ:</label> Nha Trang Khanh hoa\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Email:</label> PhamTruong@gmail.com\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Số điện thoại:</label> +84 123 456 789\r\n"
				+ "            </li>\r\n"
				+ "        </ul>\r\n"
				+ "    </div>";
		traVe.append(noiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
