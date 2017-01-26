package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_20 {
    private final Production28_20 production = new Production28_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}