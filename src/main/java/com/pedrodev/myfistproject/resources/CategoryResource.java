package com.pedrodev.myfistproject.resources;

import com.pedrodev.myfistproject.entities.Category;
import com.pedrodev.myfistproject.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category cat = categoryRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }

}
