package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_223 {
    private final Production28_223 production = new Production28_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}