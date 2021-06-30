package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetInputIDTest {
    @Test
    public void HaveOneArgs() {
        GetInputID getInputID = new GetInputID(new String[]{"5"});
        assertTrue(getInputID.validateInput());
    }

    @Test
    public void IsNotNumberInput() {
        GetInputID getInputID = new GetInputID(new String[]{"a"});
        assertFalse(getInputID.validateInput());
    }

    @Test
    public void GetCorrectNumber() {
        GetInputID getInputID = new GetInputID(new String[]{"7"});
        int result = getInputID.getInput();
        assertEquals(7,result);
    }

    @Test
    public void InputOutBound() {
        GetInputID getInputID = new GetInputID(new String[]{"250"});
        int result = getInputID.getInput();
        assertEquals(0,result);
    }

    @Test
    public void GetCorrectValue() {
        Response expected = new Response(1,7,
                "officia delectus consequatur vero aut veniam explicabo molestias",
                "https://via.placeholder.com/600/b0f7cc",
                "https://via.placeholder.com/150/b0f7cc");
        GetInputID getInputID = new GetInputID(new String[]{"7"});
        Response result = getInputID.getResponse();
        assertEquals(1,result.getAlbumId());
    }
}