package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_430 {
    private final Production8_430 production = new Production8_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}