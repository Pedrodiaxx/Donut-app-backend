package com.tecdesoftware.donutapp.persistence.crud;

import com.tecdesoftware.donutapp.persistence.entity.Donut;
import org.springframework.data.repository.CrudRepository;

public interface DonutCrudRepository extends CrudRepository<Donut, Long> {
}
