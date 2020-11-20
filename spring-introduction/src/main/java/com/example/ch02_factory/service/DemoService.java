package com.example.ch02_factory.service;

import java.util.List;

/**
 * 模拟 Service 接口
 *
 * @author lijing
 * @date 2020/11/19 21:09
 **/
public interface DemoService {

    /**
     * 从数据库查询一组数据
     *
     * @return List<String>
     */
    List<String> findAll();
}