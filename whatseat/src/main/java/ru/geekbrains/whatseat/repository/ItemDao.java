package ru.geekbrains.whatseat.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.geekbrains.whatseat.model.Item;

@Repository
public interface ItemDao extends CrudRepository<Item, Long> {

}
