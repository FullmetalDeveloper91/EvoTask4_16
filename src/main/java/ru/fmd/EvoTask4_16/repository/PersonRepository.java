package ru.fmd.EvoTask4_16.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fmd.EvoTask4_16.dto.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
