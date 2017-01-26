package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_128 {
    private final Production28_128 production = new Production28_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}