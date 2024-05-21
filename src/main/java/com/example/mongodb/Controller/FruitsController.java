package com.example.mongodb.Controller;


import com.example.mongodb.FruitsService.FruitsService;
import com.example.mongodb.model.Fruits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FruitsController {
    @Autowired
    private FruitsService service;
    @PostMapping
    public String newFruits(@RequestBody Fruits apple) {return service.addfruits(apple);}
    @GetMapping
    public List<Fruits> getFruits(){ return service.getAllApple();}
    @PutMapping("/{id}")
    public String updateFruits(@RequestBody Fruits apple, @PathVariable String id){
        return service.updateApple(apple,id);
    }
   
    }


}
