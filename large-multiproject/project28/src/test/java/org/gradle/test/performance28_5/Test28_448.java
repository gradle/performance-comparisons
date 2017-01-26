package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_448 {
    private final Production28_448 production = new Production28_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}