package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_285 {
    private final Production28_285 production = new Production28_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}