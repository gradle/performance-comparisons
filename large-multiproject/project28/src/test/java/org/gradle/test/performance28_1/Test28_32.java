package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_32 {
    private final Production28_32 production = new Production28_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}