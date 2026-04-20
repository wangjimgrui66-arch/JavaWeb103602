/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wjr
 * @version 1.0
 */
@WebServlet("/Hello") //注解
public class HelloServlet extends HttpServlet {
    //diGet比doPost用得多
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //向浏览器输出信息：Hello 同学们好！
        //设置响应的编码为UTF-8
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("hello" + "<br>");
        out.println("同学们好");
        out.close();//关闭，避免浪费
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}
