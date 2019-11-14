package com.czkj.servlet.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: servlet
 * @Package: com.czkj.servlet.servlet
 * @ClassName: BServlet
 * @Author: Administrator
 * @Description: 测试servlet
 * @Date 2019/11/14/01416:55
 */
@Slf4j
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("bServlet servlet");
        resp.getWriter().print("return register bean aServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
