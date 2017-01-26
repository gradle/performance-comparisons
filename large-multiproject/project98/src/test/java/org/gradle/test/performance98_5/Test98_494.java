package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_494 {
    private final Production98_494 production = new Production98_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}