package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_108 {
    private final Production28_108 production = new Production28_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}