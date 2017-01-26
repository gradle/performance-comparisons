package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_494 {
    private final Production93_494 production = new Production93_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}