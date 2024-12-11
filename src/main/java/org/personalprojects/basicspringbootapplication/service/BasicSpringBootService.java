package org.personalprojects.basicspringbootapplication.service;

import org.personalprojects.basicspringbootapplication.dao.BasicSpringBootDao;
import org.personalprojects.basicspringbootapplication.model.items.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicSpringBootService {

    @Autowired
    BasicSpringBootDao basicSpringBootDao;
    public String testBasicSpringBootService() {return "Basic Spring Boot Service Test Working!";}

    public String getAdbCCVision() {
        return "Hello from service";
    }

    public List<Item> getAllItems() {
        return basicSpringBootDao.findAll();
    }

    public Item createItem(Item item) {
        return basicSpringBootDao.save(item);

    }

    public void deleteItem(Integer itemId) {
        if(basicSpringBootDao.existsById(itemId)){
            basicSpringBootDao.deleteById(itemId);
        } else {
            throw new RuntimeException("Item not found with itemId : " + itemId);
        }
    }
}
