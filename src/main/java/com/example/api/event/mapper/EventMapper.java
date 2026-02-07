package com.example.api.event.mapper;

import com.example.api.event.domain.Event;
import com.example.api.event.domain.enums.EventStatus;
import com.example.api.event.dtos.EventCreateDTORequest;
import com.example.api.event.dtos.EventDTOResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EventMapper {

    public Event eventFromCreateDTORequest(EventCreateDTORequest eventCreateDTORequest){
        return Event.builder()
                .eventStatus(EventStatus.OPEN)
                .capacity(eventCreateDTORequest.capacity())
                .build();
    }

    public EventDTOResponse eventoDTOResponseFromEvent(Event event){
        return new EventDTOResponse(event.getId().toString(), event.getCapacity(), event.getEventStatus());
    }
}
