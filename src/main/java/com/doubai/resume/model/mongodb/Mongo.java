package com.doubai.resume.model.mongodb;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Mongo {

    public String name;
}
