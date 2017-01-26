package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_110 {
    private final Production28_110 production = new Production28_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}