package ru.belonogov.depository_jpa.models;

public class Reserve {

    //reserve_pk
    private int id;

    private int amount;
    private Status status;

    //reserve_goods_fk
    private int goodsId;
}
