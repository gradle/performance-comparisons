package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_494 {
    private final Production47_494 production = new Production47_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}