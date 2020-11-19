package com.example.mvc.servlet;

import com.example.mvc.service.DemoService;
import com.example.mvc.service.DemoServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet 测试示例
 *
 * @author lijing
 * @date 2020/11/19 21:01
 **/
@WebServlet(urlPatterns = "/demo")
public class DemoServlet extends HttpServlet {

    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<String> all = demoService.findAll();
        resp.getWriter().println(all);
    }
}
