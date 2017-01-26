package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_130 {
    private final Production28_130 production = new Production28_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}