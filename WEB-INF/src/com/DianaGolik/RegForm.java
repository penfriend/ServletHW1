package com.DianaGolik;

 

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class RegForm extends HttpServlet {

private static final long serialVersionUID = 1L;

protected void processRequest(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();

try {

out.println("<!DOCTYPE html><html>");
out.println("<head>");

out.println("<title>Registration form</title>");

out.println("</head>");

out.println("<body>");
String name = request.getParameter("name");
String password = request.getParameter("password");
if (name.equals("Mike") && password.equals("Johnson")) {
    out.println("Congratulation! You have succesfully entered with such parameters:");
    out.println(" username = " + name + "<br>");
    out.println(" password = " + password);
} else if (name != "" || password != "") {
         out.println("Your login or password is invalid.");
       }
	   else {
		 out.println("Please enter your login and password."); 
	   }
		
out.print("<form action=\"");
out.print("RegForm\" ");
out.println("method=POST>");
out.println("Username: ");
out.println("<input type=text size=20 name=name>");
out.println("<br>");
out.println("Password: ");
out.println("<input type=text size=20 name=password>");
out.println("<br>");
out.println("<input type=submit value=\"Send\">");
out.println("</form>");

out.println("</body>");

out.println("</html>");

 

} finally {

out.close();

}

}

 

protected void doGet(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

processRequest(request, response);

}

 

protected void doPost(HttpServletRequest request, HttpServletResponse response)

throws ServletException, IOException {

processRequest(request, response);

}

}