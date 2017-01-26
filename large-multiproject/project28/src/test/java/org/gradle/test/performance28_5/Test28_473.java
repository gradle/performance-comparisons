package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_473 {
    private final Production28_473 production = new Production28_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}