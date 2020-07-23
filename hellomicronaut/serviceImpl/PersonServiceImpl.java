package com.example.hellomicronaut.serviceImpl;

import com.example.hellomicronaut.entity.PersonDTO;
import com.example.hellomicronaut.service.PersonService;
import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonDTO getPerson(String name) {
        PersonDTO person = new PersonDTO();
        person.setName("Rodrigo");
        person.setAge("24");
        person.setLastName("Cayoja");
        personRepository.save(person);
        final PersonDTO personResponse = personRepository.find("Rodrigo");
        return personResponse;
    }
}