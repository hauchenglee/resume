package com.doubai.resume.controller;

import com.doubai.resume.model.mongodb.Mongo;
import com.doubai.resume.model.ResultBean;
import com.doubai.resume.service.MongoService;
import com.doubai.resume.util.Constants;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class MongoController {
    @Autowired
    private MongoService mongoService;

    @SneakyThrows
    @GetMapping(value = "/mongo/findByNameContains", produces = Constants.CONTENT_TYPE_JSON)
    public ResultBean<Mongo> mongo(HttpServletRequest request, @RequestBody String receiveJSON) {
        System.out.println(receiveJSON);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(receiveJSON);
        String name = jsonNode.get("name").asText();
        List<Mongo> res = mongoService.findByNameContains(name);
        System.out.println(res);
        return ResultBean.success(true);
    }

    @SneakyThrows
    @PostMapping(value = "/mongo/save", produces = Constants.CONTENT_TYPE_JSON)
    public ResultBean<Boolean> addDemo(HttpServletRequest request, @RequestBody String receiveJSON) {
        System.out.println(receiveJSON);
        ObjectMapper mapper = new ObjectMapper();
        Mongo mongo = mapper.readValue(receiveJSON, Mongo.class);
        mongoService.save(mongo);
        return ResultBean.success(true);
    }
}
