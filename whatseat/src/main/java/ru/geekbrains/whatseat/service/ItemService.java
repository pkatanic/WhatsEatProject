package ru.geekbrains.whatseat.service;
import java.util.List;

import ru.geekbrains.whatseat.model.Item;

public interface ItemService {
	List<Item> findAll();
    Item findOne(Long id);
    Item save(Item item);
    void delete(Item item);
}
