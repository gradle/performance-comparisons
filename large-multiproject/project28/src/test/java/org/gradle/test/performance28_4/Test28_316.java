package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_316 {
    private final Production28_316 production = new Production28_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}