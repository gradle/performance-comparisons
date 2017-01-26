package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_463 {
    private final Production28_463 production = new Production28_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}