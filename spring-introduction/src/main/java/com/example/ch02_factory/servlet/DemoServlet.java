package com.example.ch02_factory.servlet;

import com.example.ch02_factory.factory.BeanFactory;
import com.example.ch02_factory.service.DemoService;

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
@WebServlet(urlPatterns = "/factory")
public class DemoServlet extends HttpServlet {

    public static final DemoService demoService = BeanFactory.getDemoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<String> all = demoService.findAll();
        resp.getWriter().println(all);
    }
}