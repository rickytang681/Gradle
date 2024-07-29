package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMain() {
        assertEquals("Hello, World!", Main.getMessage());
    }
}