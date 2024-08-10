package com.shirt.store.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tb_tshirts")
public class TShirt implements Serializable {
    private static final long serialVersionUID = 1L;

    @MongoId
    private UUID id;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal discount;

    private String title;
    private String description;
    private String image;
    private Long stock;
    private TechnicalDescription techDesc;
    private Schedule schedule;
}
