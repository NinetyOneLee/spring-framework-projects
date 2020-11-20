package com.example.ch02_factory.factory;

import com.example.ch02_factory.dao.DemoDao;
import com.example.ch02_factory.dao.DemoMySQLDao;
import com.example.ch02_factory.service.DemoService;
import com.example.ch02_factory.service.DemoServiceImpl;

/**
 * 静态工厂
 *
 * @author lijing
 * @date 2020/11/20 18:40
 **/
public class BeanFactory {

    public static DemoService getDemoService() {
        return new DemoServiceImpl();
    }

    public static DemoDao getDemoDao() {
        // return new DemoDaoImpl();
        return new DemoMySQLDao();
    }
}
