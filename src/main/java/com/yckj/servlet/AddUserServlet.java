package com.yckj.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wjr
 * @version 1.0
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
    // 处理第一个请求之前 被容器（如 Tomcat）自动调用；只执行1次
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        request.setCharacterEncoding("utf-8");//
        String uname = request.getParameter("username");
        String nation = request.getParameter("nation");
        String gender = request.getParameter("gender");
        String love[] = request.getParameterValues("love");
        String intro = request.getParameter("intro");
        System.out.println(intro); //
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(uname + "<br>");
        out.println(nation + "<br>");
        out.println(gender + "<br>");
        for (int i = 0; i < love.length; i++) {
            out.print(love[i] + ",");
        }
        out.print("<br>");
        out.print(intro + "<br>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        this.doGet(request, response);
    }
}
 