package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_355 {
    private final Production28_355 production = new Production28_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}