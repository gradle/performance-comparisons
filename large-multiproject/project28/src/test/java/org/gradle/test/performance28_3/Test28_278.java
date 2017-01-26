package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_278 {
    private final Production28_278 production = new Production28_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}