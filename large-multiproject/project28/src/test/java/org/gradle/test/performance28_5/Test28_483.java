package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_483 {
    private final Production28_483 production = new Production28_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}