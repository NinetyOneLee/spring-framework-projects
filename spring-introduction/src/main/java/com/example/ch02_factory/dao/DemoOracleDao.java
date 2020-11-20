package com.example.ch02_factory.dao;

import java.util.Arrays;
import java.util.List;

/**
 * 模拟 Oracle 数据库
 *
 * @author lijing
 * @date 2020/11/20 18:45
 **/
public class DemoOracleDao implements DemoDao {

    @Override
    public List<String> findAll() {
        // jdbc operations ......
        System.out.println("DemoOracleDao findAll run ......");
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
