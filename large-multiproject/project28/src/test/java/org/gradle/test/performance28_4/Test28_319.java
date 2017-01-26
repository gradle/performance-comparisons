package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_319 {
    private final Production28_319 production = new Production28_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}