package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_494 {
    private final Production28_494 production = new Production28_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}