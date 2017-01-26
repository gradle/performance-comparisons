package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_250 {
    private final Production28_250 production = new Production28_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}