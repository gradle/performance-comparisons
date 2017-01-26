package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_383 {
    private final Production28_383 production = new Production28_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}