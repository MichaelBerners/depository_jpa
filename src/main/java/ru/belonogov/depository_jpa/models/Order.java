package ru.belonogov.depository_jpa.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//заказ
public class Order {

    //orders_pk
    private int id;
    private int date;  //дата
    private int time; //время
    private Status paymentState = Status.PAYMENT_NO;

    //orders_users_fk
    private int userId;

}
