package ru.belonogov.depository_jpa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//тип пользователя, роль
//клиент, кладовщик, бухгалтер, поставщик
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "user_types")
public class UserType {

    //user_type_pk;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_types_id_seq")
    @SequenceGenerator(name = "user_types_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "type")
    private String type;

    //@JsonIgnore
    @OneToMany(mappedBy = "userType")
    List<User> user = new ArrayList<>();


}
