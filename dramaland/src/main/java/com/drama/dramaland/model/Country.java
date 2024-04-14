package com.drama.dramaland.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "countries")
public class Country {
    private String id;
    private String name;
}
