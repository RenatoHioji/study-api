package com.example.api.event.controller;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface EventController {

    ResponseEntity<EventDTOResponse> create(EventCreateDTORequest request);
    ResponseEntity<EventDTOResponse> findById(String id);
    List<EventDTOResponse> find(int pageNum, int pageSize);
    ResponseEntity<Void> deleteById(String id);
    ResponseEntity<Void> cancelById(String id);
}
