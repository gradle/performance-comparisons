package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_197 {
    private final Production28_197 production = new Production28_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}