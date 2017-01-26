package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_368 {
    private final Production28_368 production = new Production28_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}