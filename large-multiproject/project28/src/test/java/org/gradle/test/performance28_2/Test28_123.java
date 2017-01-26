package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_123 {
    private final Production28_123 production = new Production28_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}