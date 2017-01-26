package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_280 {
    private final Production28_280 production = new Production28_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}