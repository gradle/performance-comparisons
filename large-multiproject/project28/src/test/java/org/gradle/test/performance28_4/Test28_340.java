package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_340 {
    private final Production28_340 production = new Production28_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}