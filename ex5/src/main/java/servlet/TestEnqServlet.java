package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/testenq")
public class TestEnqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");//漢字の文字化けを避けるために使う
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");
		System.out.println("name: " + name + " qtype: " + qtype);
		
		//リクエストをチェック
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません。<br>";
		}
		if(qtype == null || qtype.length() == 0) {
			errorMsg += "お問い合わせの種類が入力されていません。<br>";
		} 
		if(body == null || body.length() == 0) {
			errorMsg += "お問い合わせの内容が入力されていません。<br>";
		} 
		
		//表示するメッセージを設定
		String msg = "お名前は: " + name + "<br>";
		msg += "お問い合わせの種類: " + qtype + "<br>";
		msg += "お問い合わせの内容: " + body + "<br>";
		
		
		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html> <head> <meta charset =\\\"UTF-8\\\"l>");
		out.println("<title> お問い合わせ</title>");
		out.println("</head> <body>");
		if(errorMsg.length() > 0) {
			out.println("<p style='color:red'>" + errorMsg + "</p>");
		}else {
			out.println("<p>" + msg + "</p>");
		}
		out.println("<a href='/ex5/testenq.jsp'>もどる</a>");
		out.println("</body></html>");
	}

}
