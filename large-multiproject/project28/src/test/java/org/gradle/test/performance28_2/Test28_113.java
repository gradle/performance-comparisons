package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_113 {
    private final Production28_113 production = new Production28_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}