package com.jtssm.service;

import com.jtssm.mapper.TestMapper;
import com.jtssm.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper mapper; // 绑定mapper

    @Override
    public List<Test> getAllList() {
        return mapper.allList();
    }

}
