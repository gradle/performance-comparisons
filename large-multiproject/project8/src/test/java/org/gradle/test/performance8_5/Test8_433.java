package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_433 {
    private final Production8_433 production = new Production8_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}