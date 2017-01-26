package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_438 {
    private final Production28_438 production = new Production28_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}