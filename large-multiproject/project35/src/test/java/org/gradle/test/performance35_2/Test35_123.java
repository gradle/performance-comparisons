package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_123 {
    private final Production35_123 production = new Production35_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}