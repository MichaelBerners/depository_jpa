package ru.belonogov.depository_jpa.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.belonogov.depository_jpa.models.User;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

//пока не используется
@Data
public class SecurityUser implements UserDetails {

    private final String userName;
    private final String password;
    private final List<SimpleGrantedAuthority> authorities;
    //private final boolean isActive;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; //def
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; //def
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; //def
    }

    @Override
    public boolean isEnabled() {
        return true;  //def
    }

    public static UserDetails fromUser(User user) {
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), Collections.emptyList());
    }
}
