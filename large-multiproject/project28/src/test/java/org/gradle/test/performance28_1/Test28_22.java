package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_22 {
    private final Production28_22 production = new Production28_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}