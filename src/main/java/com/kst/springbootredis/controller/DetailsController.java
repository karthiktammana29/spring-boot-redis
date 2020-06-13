package com.kst.springbootredis.controller;

import com.kst.springbootredis.model.Details;
import com.kst.springbootredis.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/details")
public class DetailsController {
    @Autowired
    private DetailsRepository repository;

    @PostMapping("/saveDetails")
    public String saveDetails(@RequestBody Details details) {
        repository.save(details);
        return "New Details Added";
    }

    @GetMapping("/getId/{Id}")
    public String getOne(@PathVariable String Id) {
        return repository.findOne(Id);
    }


}
