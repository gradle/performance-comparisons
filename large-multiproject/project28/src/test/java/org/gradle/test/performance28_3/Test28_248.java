package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_248 {
    private final Production28_248 production = new Production28_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}