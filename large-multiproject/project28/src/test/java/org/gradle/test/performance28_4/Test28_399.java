package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_399 {
    private final Production28_399 production = new Production28_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}