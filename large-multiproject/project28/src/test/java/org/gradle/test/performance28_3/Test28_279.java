package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_279 {
    private final Production28_279 production = new Production28_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}