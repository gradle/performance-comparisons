package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_292 {
    private final Production28_292 production = new Production28_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}