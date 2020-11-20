package com.example.ch02_factory.dao;

import java.util.List;

/**
 * 模拟 Dao 接口
 *
 * @author lijing
 * @date 2020/11/19 21:09
 **/
public interface DemoDao {

    /**
     * 模拟从数据库查询一组数据
     *
     * @return List<String>
     */
    List<String> findAll();
}
