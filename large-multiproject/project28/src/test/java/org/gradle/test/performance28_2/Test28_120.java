package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_120 {
    private final Production28_120 production = new Production28_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}