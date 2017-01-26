package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_276 {
    private final Production28_276 production = new Production28_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}