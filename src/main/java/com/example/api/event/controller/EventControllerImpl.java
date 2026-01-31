package com.example.api.event.controller;

import com.example.api.event.dtos.EventResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/event")
public class EventControllerImpl implements EventController{

    @Override
    public ResponseEntity<EventResponseDTO> create() {
        return null;
    }

    @Override
    public ResponseEntity<EventResponseDTO> findById() {
        return null;
    }

    @Override
    public ResponseEntity<List<EventResponseDTO>> find(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteById() {
        return null;
    }
}
