package ru.belonogov.depository_jpa.service;

import ru.belonogov.depository_jpa.models.GoodsType;

import java.util.List;

public interface GoodsCategoryService {

    //создать новую категорию товара
    void create(GoodsType goodsType);

    //показать категорию товара по названию (может и клиент)
    GoodsType readGoodsCategory(String s);

    //показать категорию товара по id
    GoodsType readGoodsCategory(int id);

    //показать весь список категорий
    List<GoodsType> readAllGoodsCategory();

    //редактировать категорию
    boolean updateGoodsCategory(GoodsType goodsType, int id);

    //удалить категорию
    boolean deleteGoodsCategory(int id);
}
