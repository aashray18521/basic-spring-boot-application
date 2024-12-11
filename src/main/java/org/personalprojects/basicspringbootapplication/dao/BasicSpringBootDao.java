package org.personalprojects.basicspringbootapplication.dao;

import org.personalprojects.basicspringbootapplication.model.items.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicSpringBootDao extends JpaRepository<Item, Integer> {


}
