package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_298 {
    private final Production28_298 production = new Production28_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}