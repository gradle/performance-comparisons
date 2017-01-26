package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_494 {
    private final Production31_494 production = new Production31_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}