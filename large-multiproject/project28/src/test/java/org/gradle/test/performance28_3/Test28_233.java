package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_233 {
    private final Production28_233 production = new Production28_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}