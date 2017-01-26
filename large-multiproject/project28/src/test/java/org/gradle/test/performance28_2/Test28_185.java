package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_185 {
    private final Production28_185 production = new Production28_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}