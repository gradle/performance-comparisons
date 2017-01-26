package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_115 {
    private final Production28_115 production = new Production28_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}