package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_443 {
    private final Production28_443 production = new Production28_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}