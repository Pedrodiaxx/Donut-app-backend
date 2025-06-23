package com.tecdesoftware.donutapp.persistence.crud;

import com.tecdesoftware.donutapp.persistence.entity.Burger;
import org.springframework.data.repository.CrudRepository;

public interface BurgerCrudRepository extends CrudRepository<Burger, Long> {
}
