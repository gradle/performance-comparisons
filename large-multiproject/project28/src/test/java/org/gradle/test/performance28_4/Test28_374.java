package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_374 {
    private final Production28_374 production = new Production28_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}