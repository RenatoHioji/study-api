package com.example.api.event.service;

import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import com.example.api.event.mapper.EventMapper;
import com.example.api.event.repository.EventRepository;
import com.example.api.shared.IdUtils;
import com.example.api.shared.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService{

    private final EventRepository eventRepository;
    @Override
    public EventDTOResponse create(EventCreateDTORequest request) {
        return EventMapper.eventoDTOResponseFromEvent(this.eventRepository.save(EventMapper.eventFromCreateDTORequest(request)));
    }

    @Override
    public EventDTOResponse findById(String id) {
        return this.eventRepository.findById(IdUtils.stringToId(id))
                .map(EventMapper::eventoDTOResponseFromEvent)
                .orElseThrow(() -> new NotFoundException("Não foi encontrado nenhum evento com esse ID."));
    }

    @Override
    public List<EventDTOResponse> find(int pageNum, int pageSize) {
        return this.eventRepository.findAll(Pageable.ofSize(pageSize).withPage(pageNum))
                .stream()
                .map(EventMapper::eventoDTOResponseFromEvent)
                .toList();
    }

    @Override
    public void deleteById(String id) {
        this.eventRepository.deleteById(IdUtils.stringToId(id));
    }
}
