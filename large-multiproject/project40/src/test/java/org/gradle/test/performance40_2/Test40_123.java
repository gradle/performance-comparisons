package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_123 {
    private final Production40_123 production = new Production40_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}