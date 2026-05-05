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
@WebServlet("/LinkServlet")
public class LinkServlet extends HttpServlet {
    // 处理第一个请求之前 被容器（如 Tomcat）自动调用；只执行1次
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        String uname = request.getParameter("username");
        String nation = request.getParameter("nation");
        String gender = request.getParameter("gender");
        System.out.println(uname+"=======");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
            doGet(request,response);
    }
}
 