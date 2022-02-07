package ru.belonogov.depository_jpa.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//товары
public class Goods {

    //goods_pk
    private int id;
    private String name; //наименование
    private int unitsInOne; //единицы измерения 1шт = ?
    private double price; //цена (numeric в таблице)
    private int amount; //количество
    private int volumeL; //длинна
    private int volumeW; //ширина
    private int volumeH; //высота
    private String description; //описание

    //goods_goods_type_fk
    private int goodsTypesId;


}
