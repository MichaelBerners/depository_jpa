package ru.belonogov.depository_jpa.models;

public class StorageAreas {

    //Зоны хранения склада, связь с таблицей Goods (товары) и ZoneA, B, C

    //У каждого товара есть свой адрес, он складывается из номера помещения,
    //номера прохода, номера стеллажа, яруса и ячейки.

    //storage_areas_pk
    private int id;

    private String name;
    private int volumeL;
    private int volumeW;
    private int volumeH;
    private int filling;
}
