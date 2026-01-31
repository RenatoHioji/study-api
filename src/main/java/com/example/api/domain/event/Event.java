package com.example.api.domain.event;

import com.example.api.domain.BaseEntity;
import com.example.api.domain.event.enums.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Document(collection = "event")
public class Event extends BaseEntity {

    @Id
    private ObjectId id;
    private Integer capacity;
    private EventStatus eventStatus;
    private LocalDateTime startedAt;
    private LocalDateTime canceledAt;
}
