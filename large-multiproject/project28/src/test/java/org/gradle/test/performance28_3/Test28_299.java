package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_299 {
    private final Production28_299 production = new Production28_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}