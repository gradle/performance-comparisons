package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_478 {
    private final Production28_478 production = new Production28_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}