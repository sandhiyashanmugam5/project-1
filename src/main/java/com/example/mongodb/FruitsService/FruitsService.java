package com.example.mongodb.FruitsService;

import com.example.mongodb.model.Fruits;
import com.example.mongodb.repositary.FruitsRepositary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FruitsService {
    public String addfruits(Fruits apple) {
        repositary.save(apple);
        return "apple added";
    }

    @Autowired
    private FruitsRepositary repositary;

    public List<Fruits> getAllApple() {
        return repositary.findAll();
    }

    public String updateApple(Fruits apple, String id) {
        Fruits existing = repositary.findById(id).get();
        existing.setUsername(apple.getUsername());
        existing.setColour(apple.getColour());
        existing.setPrice(apple.getPrice());
        repositary.save(existing);
        return "use updated";


    }

}
