package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_118 {
    private final Production28_118 production = new Production28_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}