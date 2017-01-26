package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_344 {
    private final Production28_344 production = new Production28_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}