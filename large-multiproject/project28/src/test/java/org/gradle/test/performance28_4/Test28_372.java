package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_372 {
    private final Production28_372 production = new Production28_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}