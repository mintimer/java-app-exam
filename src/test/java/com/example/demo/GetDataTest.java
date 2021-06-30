package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetDataTest {
    @Test
    public void HaveOneArgs() {
        assertTrue(GetData.ValidateInput(new String[]{"5"}));
    }
}