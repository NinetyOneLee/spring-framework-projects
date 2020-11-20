package com.example.ch01_mvc.service;

import com.example.ch01_mvc.dao.DemoDao;
import com.example.ch01_mvc.dao.DemoDaoImpl;

import java.util.List;

/**
 * 模拟 Service 接口
 *
 * @author lijing
 * @date 2020/11/19 21:14
 **/
public class DemoServiceImpl implements DemoService {

    // 内部依赖 DemoDao 接口
    private final DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
