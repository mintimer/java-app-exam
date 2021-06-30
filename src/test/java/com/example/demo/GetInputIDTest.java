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

//    @Test
//    public void GetCorrectValue() {
//
//    }
}