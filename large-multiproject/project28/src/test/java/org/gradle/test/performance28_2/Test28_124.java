package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_124 {
    private final Production28_124 production = new Production28_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}