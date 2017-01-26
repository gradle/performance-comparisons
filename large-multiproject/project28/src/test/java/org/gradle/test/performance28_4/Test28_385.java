package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_385 {
    private final Production28_385 production = new Production28_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}