package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_194 {
    private final Production28_194 production = new Production28_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}