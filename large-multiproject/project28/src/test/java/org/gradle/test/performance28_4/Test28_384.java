package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_384 {
    private final Production28_384 production = new Production28_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}