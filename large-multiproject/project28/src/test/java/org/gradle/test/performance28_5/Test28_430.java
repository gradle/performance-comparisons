package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_430 {
    private final Production28_430 production = new Production28_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}