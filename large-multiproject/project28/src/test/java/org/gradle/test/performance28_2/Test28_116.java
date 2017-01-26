package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_116 {
    private final Production28_116 production = new Production28_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}