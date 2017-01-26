package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_328 {
    private final Production28_328 production = new Production28_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}