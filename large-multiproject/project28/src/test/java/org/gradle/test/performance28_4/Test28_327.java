package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_327 {
    private final Production28_327 production = new Production28_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}