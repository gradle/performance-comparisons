package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_153 {
    private final Production28_153 production = new Production28_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}