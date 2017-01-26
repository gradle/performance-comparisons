package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_201 {
    private final Production28_201 production = new Production28_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}