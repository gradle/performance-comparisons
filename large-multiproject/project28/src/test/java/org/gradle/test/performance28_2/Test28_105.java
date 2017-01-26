package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_105 {
    private final Production28_105 production = new Production28_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}