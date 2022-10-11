package LoginController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/save")
public class Logincontoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Logincontoller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/logindemo_db","root","8861560012@pm");
	
	Statement stmnt = con.createStatement();

	stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	

}
