package com.example.hellomicronaut.serviceImpl;

import com.example.hellomicronaut.entity.PersonDTO;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
interface PersonRepository extends CrudRepository<PersonDTO, Long> {

    PersonDTO find(String name);
}
