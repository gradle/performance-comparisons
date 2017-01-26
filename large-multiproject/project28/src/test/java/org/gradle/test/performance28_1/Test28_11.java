package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_11 {
    private final Production28_11 production = new Production28_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}