package com.yckj.servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向和转发
 * @author wjr
 * @version 1.0
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    // 处理第一个请求之前 被容器（如 Tomcat）自动调用；只执行1次
    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        //把一个变量school保存request里，我要在tysut.jsp网页上取school
        request.setAttribute("school","tyust--------");
        //跳转网页，重定向
        //response.sendRedirect("tyust.jsp");
        //跳转网页，转发
        request.getRequestDispatcher("tyust.jsp").forward(request,response); //链式编程
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException {
        this.doGet(request, response);
    }
}
 