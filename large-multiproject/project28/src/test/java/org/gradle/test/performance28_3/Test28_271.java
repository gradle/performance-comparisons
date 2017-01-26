package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_271 {
    private final Production28_271 production = new Production28_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}