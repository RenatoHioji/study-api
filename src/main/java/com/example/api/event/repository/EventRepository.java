package com.example.api.event.repository;

import com.example.api.event.domain.Event;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, ObjectId> {
}
