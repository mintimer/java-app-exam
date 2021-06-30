package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetDataTest {
    @Test
    public void HaveOneArgs() {
        GetData getData = new GetData(new String[]{"5"});
        assertTrue(getData.validateInput());
    }

    @Test
    public void IsNotNumberInput() {
        GetData getData = new GetData(new String[]{"a"});
        assertFalse(getData.validateInput());
    }

    @Test void GetCorrectNumber() {
        GetData getData = new GetData(new String[]{"7"});
        int result = getData.getInput();
        assertEquals(7,result);
    }
}