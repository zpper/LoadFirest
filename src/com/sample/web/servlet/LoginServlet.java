package com.sample.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author Levin
 * @time 2009-5-29
 */
public class LoginServlet extends HttpServlet{
	
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        //WEB��������һ��ʹ��Request����õ��õ��ͻ�����������
        String userName = request.getParameter("userName");
        //WEB����������������Session
        request.getSession().setAttribute("userFromA", userName);
        //WEB������������ʹ��Response����
        response.setCharacterEncoding("GBK");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>��¼����ҳ��</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(userName + ",����sessionId��" + request.getSession().getId());
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();        
    }    
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        doGet(request, response);
    }
}
