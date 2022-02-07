package ru.belonogov.depository_jpa;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@AllArgsConstructor
@Component
public class JdbcTemp implements CommandLineRunner {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(jdbcTemplate.getClass().getName());


    }
}
