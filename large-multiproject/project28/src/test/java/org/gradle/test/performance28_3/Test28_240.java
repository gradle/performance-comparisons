package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_240 {
    private final Production28_240 production = new Production28_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}