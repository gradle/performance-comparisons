package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_402 {
    private final Production28_402 production = new Production28_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}