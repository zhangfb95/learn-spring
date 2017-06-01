package com.learn.spring.resource.service.impl;

import com.learn.spring.resource.service.OtherQueryService;
import com.learn.spring.resource.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangfb
 */
@Service
public class QueryServiceImpl implements QueryService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private OtherQueryService otherQueryService;

    @Transactional
    public void query() {
        System.out.println(jdbcTemplate.queryForList("select * from master"));
        otherQueryService.query();
    }

    @Transactional
    public void querySimple() {
        System.out.println(jdbcTemplate.queryForList("select * from master"));
    }
}
