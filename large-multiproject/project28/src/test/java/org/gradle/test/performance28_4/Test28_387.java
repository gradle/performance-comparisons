package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_387 {
    private final Production28_387 production = new Production28_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}