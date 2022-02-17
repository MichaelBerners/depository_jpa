package ru.belonogov.depository_jpa;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.belonogov.depository_jpa.models.UserType;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;


@AllArgsConstructor
//@Component
public class JdbcTemp implements CommandLineRunner {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        UserType user = jdbcTemplate.queryForObject("select * from user_types where id = 1", new RowMapper<UserType>() {
            @Override
            public UserType mapRow(ResultSet rs, int rowNum) throws SQLException {
                UserType userType = new UserType();
                userType.setUser(null);
                userType.setId(rs.getLong("id"));
                userType.setType(rs.getString("type"));
                return userType;
            }
        });

        System.out.println("Дата Сурс: " + dataSource.getClass().getName() +
                "    JdbcTemplate: " + jdbcTemplate.getClass().getName());
        System.out.println(user.getId() + " " + user.getType());
    }
}
