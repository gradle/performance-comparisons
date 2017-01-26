package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_494 {
    private final Production84_494 production = new Production84_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}