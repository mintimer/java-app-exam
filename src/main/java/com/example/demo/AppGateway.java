package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.sql.ResultSet;

@Component
public class AppGateway {

    @Autowired
    private RestTemplate restTemplate;

    public boolean validateInput(String[] args) {
        if (args.length == 1) {
            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getInput(String[] args) {
        if (validateInput(args)) {
            int id = Integer.parseInt(args[0]);
            if (id > 0 && id < 250)
                return id;
        }
        return 0;
    }

    public ResponseItem getResponseItem(String[] args) {
        int id = getInput(args);
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos/" + id, ResponseItem.class);
    }

    public Response getResponse(){
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos",Response.class);
    }
}
