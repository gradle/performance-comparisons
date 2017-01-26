package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_123 {
    private final Production13_123 production = new Production13_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}