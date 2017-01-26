package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_376 {
    private final Production28_376 production = new Production28_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}