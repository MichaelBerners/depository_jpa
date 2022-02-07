package ru.belonogov.depository_jpa.service;

import ru.belonogov.depository_jpa.models.Order;

import java.util.List;

public interface BidsService {

    //создание новой клиентской заявки (клиентом)
    void createBids();

    //весь список заявок доступен кладовщику и бухгалтеру, клиенту только свои
    Order readBid(int id);

    //весь список заявок может смотреть кладовщик и бухгалтер, клиент только свои
    List<Order> readAllBids();

    //изменять заявку клиент может во всех случаях кроме PAYMENT_YES
    boolean updateBids(Order order, int id);
}
