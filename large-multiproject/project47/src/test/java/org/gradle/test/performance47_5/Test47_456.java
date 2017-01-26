package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_456 {
    private final Production47_456 production = new Production47_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}