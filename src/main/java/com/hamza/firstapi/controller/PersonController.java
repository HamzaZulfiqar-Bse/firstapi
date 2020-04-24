package com.hamza.firstapi.controller;

import com.hamza.firstapi.entity.Person;
import com.hamza.firstapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping
    public List<Person> getAllPersons(){
            return personService.getAllPersons();
    }
}
