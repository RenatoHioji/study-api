package com.example.api.event.dtos;

import com.example.api.event.domain.enums.EventStatus;

public record EventDTOResponse(
        String id,
        Integer capacity,
        EventStatus eventStatus
) {
}
