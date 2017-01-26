package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_101 {
    private final Production28_101 production = new Production28_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}