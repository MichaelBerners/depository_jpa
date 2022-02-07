package ru.belonogov.depository_jpa.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.belonogov.depository_jpa.models.User;
import ru.belonogov.depository_jpa.models.UserType;
import ru.belonogov.depository_jpa.repository.UserRepository;
import ru.belonogov.depository_jpa.service.UsersService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

   UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public User read(Long id) {

        return userRepository.findById(id).get();
    }

    @Override
    public List<User> readAll() {

        return userRepository.findAll(Sort.by(Sort.Direction.ASC, "lastName", "firstName")); //desc
    }

    @Override
    @Transactional
    public List<User> readUsersByType(String str) {
       return userRepository.findUserByUserTypeType(str);

    }

    @Override
    public List<User> readUserLastName(String str) {
        List<User> users = userRepository.findAllByLastNameLike(str);
        System.out.println();
        return users;
    }

    @Override
    public boolean update(User user, Long id) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;

    }
}
