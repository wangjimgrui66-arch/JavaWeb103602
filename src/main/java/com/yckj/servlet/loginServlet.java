package com.yckj.servlet;

import com.sun.source.tree.IfTree;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.out;

/**
 * 用户登录：用户名是admin，密码是123
 *
 * @author wjr
 * @version 1.0
 */

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    // 处理第一个请求之前 被容器（如 Tomcat）自动调用；只执行1次
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        // 1.接受网页上的文本框的值，共两个
        String uname = request.getParameter("username");
        String upsw = request.getParameter("userpsw");
        //2. 判断
        if ("admin".equals(uname) && "123".equals(upsw)) {
            out.println("登陆成功");
        } else {
            out.println("登陆失败");
        }
        out.close();
        //3. 给用户提示
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request, response);
    }
}
 