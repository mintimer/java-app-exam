package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AppGatewayTest {

    @Autowired
    private AppGateway appGateway;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void HaveOneArgs() {
        AppGateway appGateway = new AppGateway();
        assertTrue(appGateway.validateInput(new String[]{"5"}));
    }

    @Test
    public void IsNotNumberInput() {
        AppGateway appGateway = new AppGateway();
        assertFalse(appGateway.validateInput((new String[]{"a"})));
    }

    @Test
    public void GetCorrectNumber() {
        AppGateway appGateway = new AppGateway();
        int result = appGateway.getInput(new String[]{"7"});
        assertEquals(7,result);
    }

    @Test
    public void InputOutBound() {
        AppGateway appGateway = new AppGateway();
        int result = appGateway.getInput(new String[]{"250"});
        assertEquals(0,result);
    }

    @Test
    public void GetResponse() {
        AppGateway appGateway = new AppGateway();
        Response result = appGateway.getResponse();
        assertEquals(10,result.getResponse().size());
    }

    @Test
    public void GetResponseWithID() {
        ResponseItem expected = new ResponseItem(1,7,
                "officia delectus consequatur vero aut veniam explicabo molestias",
                "https://via.placeholder.com/600/b0f7cc",
                "https://via.placeholder.com/150/b0f7cc");
        AppGateway appGateway = new AppGateway();
        ResponseItem result = appGateway.getResponseItem(new String[]{"7"});
        assertEquals(expected,result);
    }
}