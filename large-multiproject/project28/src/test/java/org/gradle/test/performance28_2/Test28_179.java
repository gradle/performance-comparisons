package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_179 {
    private final Production28_179 production = new Production28_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}