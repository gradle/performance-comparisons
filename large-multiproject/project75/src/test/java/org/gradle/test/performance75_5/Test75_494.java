package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_494 {
    private final Production75_494 production = new Production75_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}