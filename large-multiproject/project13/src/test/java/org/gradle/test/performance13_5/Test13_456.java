package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_456 {
    private final Production13_456 production = new Production13_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}