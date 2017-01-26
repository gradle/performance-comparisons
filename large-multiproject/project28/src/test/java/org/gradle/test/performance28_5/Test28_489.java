package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_489 {
    private final Production28_489 production = new Production28_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}