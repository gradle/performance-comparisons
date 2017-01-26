package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_132 {
    private final Production28_132 production = new Production28_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}