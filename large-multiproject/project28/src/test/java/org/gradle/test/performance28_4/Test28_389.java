package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_389 {
    private final Production28_389 production = new Production28_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}