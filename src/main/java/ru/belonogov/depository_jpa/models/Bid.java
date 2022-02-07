package ru.belonogov.depository_jpa.models;

//заявка
public class Bid {

    //bids_pk
    private int id;
    private String status;

    //bids_orders_id
    private int ordersId;
    //bids_goods_id
    private int goodsId;

    private int amount;

}
