package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_413 {
    private final Production28_413 production = new Production28_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}