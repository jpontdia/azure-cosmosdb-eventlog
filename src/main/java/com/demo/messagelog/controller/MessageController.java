package com.demo.messagelog.controller;

import com.demo.messagelog.model.Events;
import com.demo.messagelog.service.EventsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@RequestMapping("/")
@Slf4j
@SuppressWarnings("unused")
public class MessageController {

    @Autowired
    EventsRepository eventsRepository;

    @PostMapping("/events")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Events events){
        log.debug("messageId: {}", events.getMessageId());
        byte[] messageBytes = Base64.getDecoder().decode(events.getMessage());
        var messageDecoded = new String(messageBytes);
        var newEvent = Events.builder()
                .event(events.getEvent())
                .messageId(events.getMessageId())
                .correlationId(events.getCorrelationId())
                .queueTopic(events.getQueueTopic())
                .subscription(events.getSubscription())
                .message(messageDecoded)
                .success(events.isSuccess())
                .error(events.getError())
                .build();

        eventsRepository.save(newEvent).subscribe();
    }
}
