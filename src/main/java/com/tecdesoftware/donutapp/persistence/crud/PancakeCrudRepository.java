package com.tecdesoftware.donutapp.persistence.crud;

importcom.tecdesoftware.donutapp.persistence.entity.Pancake;
import org.springframework.data.repository.CrudRepository;

public interface PancakeCrudRepository extends CrudRepository<Pancake, Long> {
}
