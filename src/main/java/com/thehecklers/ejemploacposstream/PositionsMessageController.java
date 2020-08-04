package com.thehecklers.ejemploacposstream;

import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

//@EnableScheduling
@AllArgsConstructor
//@Controller
public class PositionsMessageController {
    private final AircraftRepository repository;

//    @Scheduled(fixedRate = 1_000)
//    @MessageMapping("/")
//    @SendTo("/topic/positions")
    public Iterable<Aircraft> sendPositions() throws Exception {
        return repository.findAll();
    }
}