package com.example.api.event.controller;

import com.example.api.event.dtos.EventResponseDTO;
import java.util.List;


public interface EventController {

    EventResponseDTO create();
    EventResponseDTO findById();
    List<EventResponseDTO> find(int pageNum, int pageSize);
    void deleteById();
}
