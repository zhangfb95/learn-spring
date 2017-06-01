package com.learn.spring.resource.service.impl;

import com.keryun.calm.multi.ds.annotation.MultiDs;
import com.learn.spring.resource.service.OtherQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangfb
 */
@Service
public class OtherQueryServiceImpl implements OtherQueryService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @MultiDs("other")
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void query() {
        System.out.println(jdbcTemplate.queryForList("select * from other"));
    }
}
