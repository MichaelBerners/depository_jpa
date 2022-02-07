package ru.belonogov.depository_jpa.service;

import ru.belonogov.depository_jpa.models.UserType;

import java.util.List;

//сервис администратора
public interface ClientTypesService {

    //создать новый тип клиента
    void createClientType(UserType userType);

    //поиск по свойствам (названию) типа клиента
    UserType readClientType(String s);

    //поиск по id клиента
    UserType readClientType(int id);

    //показать весть список типов клиентов
    List<UserType> readAllClientTypes();

    //изменить тип клиента
    boolean updateClientType(UserType userType, int id);

    //удалить тип клиента
    boolean deleteClientType(int id);
}
