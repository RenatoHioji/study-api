package com.example.api.shared;

import lombok.experimental.UtilityClass;
import org.bson.types.ObjectId;

@UtilityClass
public class IdUtils {

    public ObjectId stringToId(String id){
        try {
            return new ObjectId(id);
        }catch (Exception _){
            throw new InvalidFormatException("Id inválido");
        }
    }
}
