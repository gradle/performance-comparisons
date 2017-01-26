package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_335 {
    private final Production28_335 production = new Production28_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}