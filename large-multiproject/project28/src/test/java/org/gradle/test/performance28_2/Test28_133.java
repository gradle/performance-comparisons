package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_133 {
    private final Production28_133 production = new Production28_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}