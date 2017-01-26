package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_256 {
    private final Production28_256 production = new Production28_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}