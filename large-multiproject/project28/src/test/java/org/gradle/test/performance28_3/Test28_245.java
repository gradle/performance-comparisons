package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_245 {
    private final Production28_245 production = new Production28_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}