package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_451 {
    private final Production28_451 production = new Production28_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}