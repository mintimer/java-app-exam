package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetInputID {

    @Autowired
    private RestTemplate restTemplate;

    private static String[] args;

    public GetInputID(String[] args) {
        GetInputID.args = args;
    }

    public boolean validateInput() {
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

    public int getInput() {
        if (validateInput()) {
            int id = Integer.parseInt(args[0]);
            if (id > 0 && id < 250)
                return id;
        }
        return 0;
    }

    public Response getResponse() {
        int id = this.getInput();
        System.out.println(id);
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos/" + id,Response.class);
    }
}
