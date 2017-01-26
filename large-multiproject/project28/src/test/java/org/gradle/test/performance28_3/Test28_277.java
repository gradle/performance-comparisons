package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_277 {
    private final Production28_277 production = new Production28_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}