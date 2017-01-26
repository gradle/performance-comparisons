package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_429 {
    private final Production28_429 production = new Production28_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}