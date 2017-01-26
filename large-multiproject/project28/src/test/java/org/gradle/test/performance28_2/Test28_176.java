package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_176 {
    private final Production28_176 production = new Production28_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}