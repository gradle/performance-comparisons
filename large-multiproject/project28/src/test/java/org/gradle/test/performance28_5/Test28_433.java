package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_433 {
    private final Production28_433 production = new Production28_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}