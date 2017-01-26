package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_13 {
    private final Production28_13 production = new Production28_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}