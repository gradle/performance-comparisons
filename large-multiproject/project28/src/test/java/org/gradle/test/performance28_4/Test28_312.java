package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_312 {
    private final Production28_312 production = new Production28_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}