package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_332 {
    private final Production28_332 production = new Production28_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}