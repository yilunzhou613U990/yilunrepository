package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getMatchCount(String userName, String password) {
        Integer integer = jdbcTemplate.queryForObject(" SELECT count(*) FROM t_user where user_name=? and password=?", new Object[]{userName, password}, Integer.class);
        System.out.println("I don't know programming!!!!");
        System.out.println("think twice");
        return 0;
    }
}
