package com.example.api.event.domain;

import com.example.api.event.domain.enums.EventStatus;
import com.example.api.shared.BaseEntity;
import com.example.api.shared.BussinessException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.cglib.core.Local;
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

    private void close(){
        this.eventStatus = EventStatus.CLOSED;
    }

    public void open(){
        if(this.eventStatus.equals(EventStatus.CANCELED)){
            this.eventStatus = EventStatus.OPEN;
        }
        throw new BussinessException("Não é possível reabrir um evento que não está cancelado.");
    }

    public void start(){
        if(this.eventStatus.equals(EventStatus.FULL) || eventStatus.equals(EventStatus.OPEN)){
            this.eventStatus = EventStatus.ON_GOING;
        }
        throw new BussinessException("Não é possível iniciar um evento que não esteja cheio ou não esteja aberto");
    }

    public void cancel(){
        if(!this.eventStatus.equals(EventStatus.COMPLETED)){
            this.eventStatus = EventStatus.CANCELED;
            this.canceledAt = LocalDateTime.now();
        }
        throw new BussinessException("Não é possível cancelar um evento completo");
    }

    public void complete(){
        if(this.eventStatus.equals(EventStatus.ON_GOING)){
            this.eventStatus = EventStatus.COMPLETED;
        }
        throw new BussinessException("Não é possível completar um evento que não esteja em andamento");

    }

    public void full(){
        if(this.eventStatus.equals(EventStatus.OPEN)){
            this.eventStatus = EventStatus.FULL;
        }

        throw new BussinessException("Não é possível indicar como cheio um evento que não está como aberto");
    }
}
