package com.example.ch02_factory.dao;

import java.util.Arrays;
import java.util.List;

/**
 * 模拟 MySQL 数据库
 *
 * @author lijing
 * @date 2020/11/20 18:44
 **/
public class DemoMySQLDao implements DemoDao {

    @Override
    public List<String> findAll() {
        // jdbc operations ......
        System.out.println("DemoMySQLDao findAll run ......");
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
