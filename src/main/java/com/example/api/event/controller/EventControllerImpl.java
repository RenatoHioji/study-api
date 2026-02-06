package com.example.api.event.controller;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/event")
public class EventControllerImpl implements EventController{

    @Override
    @PostMapping
    public ResponseEntity<EventDTOResponse> create(@RequestBody @Validated EventCreateDTORequest request) {
        return ResponseEntity.status(201).build();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<EventDTOResponse> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok().build();
    }

    @Override
    @QueryMapping
    public ResponseEntity<List<EventDTOResponse>> find(@Argument int pageNum, @Argument int pageSize) {
        return ResponseEntity.ok().build();
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        return ResponseEntity.noContent().build();
    }
}
