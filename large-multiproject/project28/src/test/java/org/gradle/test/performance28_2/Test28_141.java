package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_141 {
    private final Production28_141 production = new Production28_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}