package ru.belonogov.depository_jpa;

import java.sql.*;

public class JdbcMain {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/depository",
                "root", "111")) {
            /*try(PreparedStatement stmt = con.prepareStatement("insert into goods_types (type) values (?) ")) {
                for (int i = 0; i < 100; i++){
                    //stmt.setInt(1, i);
                    stmt.setString(1, "type " + i);
                    stmt.addBatch();
                }
                stmt.executeBatch();

            }*/

            /*try(PreparedStatement stmt2 = con.prepareStatement("select * from goods_types where id = ?")) {

                stmt2.setInt(1, 20);

                ResultSet rs = stmt2.executeQuery();

                while (rs.next()) {
                    System.out.println(rs.getString("type"));
                }
            }*/

            try (PreparedStatement stmt = con.prepareStatement("select * from users")) {

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String lastName = rs.getString("last_name");
                    System.out.println(lastName);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
