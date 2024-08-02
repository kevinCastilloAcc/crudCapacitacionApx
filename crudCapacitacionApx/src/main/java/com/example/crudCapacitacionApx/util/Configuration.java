package com.example.crudCapacitacionApx.util;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        jdbcTemplate.setQueryTimeout(20); //20 seconds
        jdbcTemplate.setFetchSize(10);  //fetch 10 rows at a time
        return jdbcTemplate;
    }
}
