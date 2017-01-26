package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_375 {
    private final Production28_375 production = new Production28_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}