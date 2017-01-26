package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_428 {
    private final Production28_428 production = new Production28_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}