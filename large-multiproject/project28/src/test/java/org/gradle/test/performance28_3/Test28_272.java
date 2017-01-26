package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_272 {
    private final Production28_272 production = new Production28_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}