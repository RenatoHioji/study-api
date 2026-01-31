package com.example.api.event.controller;

import com.example.api.event.dtos.EventResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface EventController {

    ResponseEntity<EventResponseDTO> create();
    ResponseEntity<EventResponseDTO> findById();
    ResponseEntity<List<EventResponseDTO>> find(int pageNum, int pageSize);
    ResponseEntity<Void> deleteById();
}
