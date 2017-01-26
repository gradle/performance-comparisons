package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_487 {
    private final Production28_487 production = new Production28_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}