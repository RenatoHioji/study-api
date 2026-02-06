package com.example.api.participant.participant;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "participant")
@NoArgsConstructor
@Builder
@Getter
public class Participant extends Person{
}
