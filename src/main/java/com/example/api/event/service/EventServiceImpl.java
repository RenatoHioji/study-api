package com.example.api.event.service;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import com.example.api.event.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService{

    private final EventRepository eventRepository;
    @Override
    public EventDTOResponse create(EventCreateDTORequest request) {
        return null;
    }

    @Override
    public EventDTOResponse findById(String id) {
        return null;
    }

    @Override
    public List<EventDTOResponse> find(int pageNum, int pageSize) {
        return List.of();
    }

    @Override
    public void deleteById(String id) {

    }
}
