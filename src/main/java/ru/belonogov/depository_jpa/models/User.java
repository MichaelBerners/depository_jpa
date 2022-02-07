package ru.belonogov.depository_jpa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    public User() {
    }

    //для создания клиента с дефолтными полями

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq")
    @SequenceGenerator(name = "users_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "last_name")
    @NotEmpty(message = "Фамилия не должна быть пустой")
    private String lastName;
    @Column(name = "first_name")
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 20, message = "Некорректное имя")
    private String firstName;
    @Column(name = "patronymic")
    @NotEmpty(message = "Отчество не должно быть пустым")
    private String patronymic;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    @NotEmpty(message = "Email не должен быть пустым")
    @Email
    private String email;
    @Column(name = "password")
    private String password; //временно

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_types_id")
    private UserType userType;

}
