package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_494 {
    private final Production25_494 production = new Production25_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}