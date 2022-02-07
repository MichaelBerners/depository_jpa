package ru.belonogov.depository_jpa.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.belonogov.depository_jpa.models.User;
import ru.belonogov.depository_jpa.service.UsersService;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    private UsersService usersService;

    //получить список всех клиентов
    @GetMapping()
    public List<User> readAll() {
        return usersService.readAll();
    }

    //получить конкретного клиента по id
    @GetMapping("/{id}")
    public User read(@PathVariable("id") @Positive Long id) {
        return usersService.read(id);
    }

    @GetMapping("/type/{str}")
    public List<User> readByType(@PathVariable("str") String str) {
        return usersService.readUsersByType(str);
    }

    @GetMapping("/ln/{str}")
    public List<User> readByTypes(@PathVariable("str") String str) {
        return usersService.readUserLastName(str);
    }

    //создать клиента
    @PostMapping("/new")
    public void create(@RequestBody @Valid User user) {

        usersService.create(user);
    }

    //редактировать клиента
    @PutMapping("/{id}")
    public void update(@RequestBody @Valid User user, @PathVariable("id") @Positive Long id) {
        if (usersService.update(user, id))
            System.out.println("Пользователь с id " + id + " изменен успешно");
    }

    //удалить клиента по конкретному id
    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable("id") @Positive Long id) {

        if (usersService.delete(id))
            System.out.println("Пользователь  удален успешно");
    }


}

