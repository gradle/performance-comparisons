package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_349 {
    private final Production28_349 production = new Production28_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}