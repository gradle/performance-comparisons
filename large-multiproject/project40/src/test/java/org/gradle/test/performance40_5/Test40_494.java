package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_494 {
    private final Production40_494 production = new Production40_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}