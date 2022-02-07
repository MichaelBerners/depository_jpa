package ru.belonogov.depository_jpa.service;

import ru.belonogov.depository_jpa.models.User;
import ru.belonogov.depository_jpa.models.UserType;

import java.util.List;

public interface UsersService {

    //создать нового пользователя
    void create(User user);

    //прочитать данные пользователя по id
    User read(Long id);

    //вывести весь список пользователей
    List<User> readAll();

    //List<User> readUsersByType(Long id);

    List<User> readUsersByType(String str);

    List<User> readUserLastName(String str);

    //изменить пользователя с id
    boolean update(User client, Long id);

    //удалить пользовател с id
    boolean delete(Long id);


}
