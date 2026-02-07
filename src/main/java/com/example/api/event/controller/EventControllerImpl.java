package com.example.api.event.controller;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import com.example.api.event.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/event")
@RequiredArgsConstructor
public class EventControllerImpl implements EventController{

    private final EventService eventService;

    @Override
    @PostMapping
    public ResponseEntity<EventDTOResponse> create(@RequestBody @Validated EventCreateDTORequest request) {
        return ResponseEntity.status(201).body(this.eventService.create(request));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<EventDTOResponse> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.eventService.findById(id));
    }

    @Override
    @QueryMapping
    public List<EventDTOResponse> find(@Argument int pageNum, @Argument int pageSize) {
        return this.eventService.find(pageNum, pageSize);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        this.eventService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
