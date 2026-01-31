package com.example.api.event.service;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;

import java.util.List;

public interface EventService {
    EventDTOResponse create(EventCreateDTORequest request);
    EventDTOResponse findById(String id);
    List<EventDTOResponse> find(int pageNum, int pageSize);
    void deleteById(String id);
}
