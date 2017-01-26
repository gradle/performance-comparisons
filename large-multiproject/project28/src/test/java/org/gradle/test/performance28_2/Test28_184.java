package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_184 {
    private final Production28_184 production = new Production28_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}