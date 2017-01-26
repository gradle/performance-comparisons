package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_23 {
    private final Production28_23 production = new Production28_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}