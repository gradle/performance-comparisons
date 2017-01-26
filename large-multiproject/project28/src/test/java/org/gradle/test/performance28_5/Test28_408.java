package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_408 {
    private final Production28_408 production = new Production28_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}