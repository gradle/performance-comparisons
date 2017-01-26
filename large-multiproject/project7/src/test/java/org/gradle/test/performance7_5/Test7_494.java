package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_494 {
    private final Production7_494 production = new Production7_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}