package com.demo.messagelog.service;

import com.demo.messagelog.model.Events;
import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;

@Repository
public interface EventsRepository extends ReactiveCosmosRepository<Events, String> {
}
