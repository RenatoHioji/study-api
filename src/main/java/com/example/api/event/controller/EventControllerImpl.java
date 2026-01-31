package com.example.api.event.controller;

import com.example.api.event.dtos.EventResponseDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/event")
public class EventControllerImpl implements EventController{

    @Override
    public EventResponseDTO create() {
        return null;
    }

    @Override
    public EventResponseDTO findById() {
        return null;
    }

    @Override
    public List<EventResponseDTO> find(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return List.of();
    }

    @Override
    public void deleteById() {

    }
}
