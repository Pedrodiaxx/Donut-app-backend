package com.tecdesoftware.donutapp.persistence.crud;

import com.tecdesoftware.donutapp.persistence.entity.Smoothie;
import org.springframework.data.repository.CrudRepository;

public interface SmoothieCrudRepository extends CrudRepository<Smoothie, Long> {
}
