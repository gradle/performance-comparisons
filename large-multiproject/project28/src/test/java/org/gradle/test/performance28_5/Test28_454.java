package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_454 {
    private final Production28_454 production = new Production28_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}