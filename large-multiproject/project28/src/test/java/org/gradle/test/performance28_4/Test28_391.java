package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_391 {
    private final Production28_391 production = new Production28_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}