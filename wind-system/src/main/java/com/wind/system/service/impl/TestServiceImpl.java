package com.wind.system.service.impl;

import com.wind.system.mapper.TestMapper;
import com.wind.system.model.Test;
import com.wind.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> getTestInfo() {
       // return testMapper.getTestInfo();
        Test test = testMapper.selectByPrimaryKey(1L);
        System.out.println("*****************"+test.getMobile());
        return null;
    }
}
