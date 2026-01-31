package com.example.api.event.controller;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/event")
public class EventControllerImpl implements EventController{

    @Override
    public ResponseEntity<EventDTOResponse> create(@RequestBody @Validated EventCreateDTORequest request) {
        return null;
    }

    @Override
    public ResponseEntity<EventDTOResponse> findById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<EventDTOResponse>> find(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteById(String id) {
        return null;
    }
}
