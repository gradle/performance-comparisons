package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_414 {
    private final Production28_414 production = new Production28_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}