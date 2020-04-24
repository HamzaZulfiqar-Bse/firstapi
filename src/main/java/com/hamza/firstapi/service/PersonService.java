package com.hamza.firstapi.service;

import com.hamza.firstapi.entity.Person;
import com.hamza.firstapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Service
public class PersonService {

    @Autowired

    private PersonRepository personRepository;

    public Person addPerson(Person person){
        personRepository.save(person);
        return person;
    }
    public List<Person> getAllPersons(){
      return personRepository.findAll();
    }

    public Person findPersonById(int id){
        return personRepository.findById(id).orElse(null);
    }
    public Person updatePerson(Person person,int id){
        person.setId(id);
        personRepository.save(person);
        return person;
    }
    public void deletePerson(int id){
        personRepository.deleteById(id);

    }
}
