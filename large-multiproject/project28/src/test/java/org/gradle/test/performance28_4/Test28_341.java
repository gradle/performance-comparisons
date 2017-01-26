package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_341 {
    private final Production28_341 production = new Production28_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}