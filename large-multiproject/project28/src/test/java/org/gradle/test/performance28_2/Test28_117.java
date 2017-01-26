package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_117 {
    private final Production28_117 production = new Production28_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}