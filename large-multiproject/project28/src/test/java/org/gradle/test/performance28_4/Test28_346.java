package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_346 {
    private final Production28_346 production = new Production28_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}