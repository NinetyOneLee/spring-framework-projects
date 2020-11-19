package com.example.mvc.dao;

import java.util.Arrays;
import java.util.List;

/**
 * 模拟 Dao 接口
 *
 * @author lijing
 * @date 2020/11/19 21:13
 **/
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        // 此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
