package com.example.api.domain.person.participant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "participant")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Participant extends Person{
}
