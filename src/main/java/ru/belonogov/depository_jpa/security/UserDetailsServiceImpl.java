package ru.belonogov.depository_jpa.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.belonogov.depository_jpa.models.User;
import ru.belonogov.depository_jpa.repository.UserRepository;

import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOp = userRepository.findUserByEmail(email);

        if (userOp.isEmpty())
            throw new UsernameNotFoundException(String.format("User %s not found", email));
        User user = userOp.get();
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), Collections.emptyList());

    }
}
