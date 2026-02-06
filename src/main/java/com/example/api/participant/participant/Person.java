package com.example.api.participant.participant;

import com.example.api.participant.utils.BaseEntity;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

public abstract class Person extends BaseEntity {

    @Id
    protected ObjectId id;
    @Field("first_name")
    protected String firstName;
    @Field("last_name")
    protected String lastName;
    @Field("birth_date")
    protected LocalDate birthDate;
}
