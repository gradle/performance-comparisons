package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_439 {
    private final Production28_439 production = new Production28_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}