package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_262 {
    private final Production28_262 production = new Production28_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}