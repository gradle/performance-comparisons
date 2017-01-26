package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_491 {
    private final Production28_491 production = new Production28_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}