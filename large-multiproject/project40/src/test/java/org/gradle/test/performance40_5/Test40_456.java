package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_456 {
    private final Production40_456 production = new Production40_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}