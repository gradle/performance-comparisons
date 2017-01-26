package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_359 {
    private final Production28_359 production = new Production28_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}