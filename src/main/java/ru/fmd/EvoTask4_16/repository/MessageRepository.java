package ru.fmd.EvoTask4_16.repository;

import org.springframework.data.repository.CrudRepository;
import ru.fmd.EvoTask4_16.dto.Message;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
