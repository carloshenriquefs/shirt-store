package com.shirt.store.entitiy;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Data
@Document(collection = "tb_techdescs")
public class TechnicalDescription {

    @MongoId
    private UUID id;
    private String color;
    private String size;
    private String type;
    private String genre;
}
