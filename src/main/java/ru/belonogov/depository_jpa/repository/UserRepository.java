package ru.belonogov.depository_jpa.repository;

import org.hibernate.usertype.UserType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.belonogov.depository_jpa.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String email);

    List<User> findAllByLastNameLike(String pattern);

    List<User> findUserByUserTypeType(String str);


    @Query("select c from User c where c.userType = :user_type_id")  //лишнее
    List<User> findUserByUserType(@Param("user_type_id") Long user_type_id);


}
