package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_456 {
    private final Production35_456 production = new Production35_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}