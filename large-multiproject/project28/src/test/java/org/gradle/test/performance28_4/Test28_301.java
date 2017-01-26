package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_301 {
    private final Production28_301 production = new Production28_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}