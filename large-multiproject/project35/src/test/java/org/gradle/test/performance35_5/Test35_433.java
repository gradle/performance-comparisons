package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_433 {
    private final Production35_433 production = new Production35_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}