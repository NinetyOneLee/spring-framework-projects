package com.example.ch02_factory.service;

import com.example.ch02_factory.dao.DemoDao;
import com.example.ch02_factory.factory.BeanFactory;

import java.util.List;

/**
 * 模拟 Service 接口
 *
 * @author lijing
 * @date 2020/11/20 18:47
 **/
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return this.demoDao.findAll();
    }
}
