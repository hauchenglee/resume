package com.doubai.resume.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Mongo {

    public String name;
}
