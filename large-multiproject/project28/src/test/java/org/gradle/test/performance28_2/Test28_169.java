package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_169 {
    private final Production28_169 production = new Production28_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}