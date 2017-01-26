package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_125 {
    private final Production28_125 production = new Production28_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}