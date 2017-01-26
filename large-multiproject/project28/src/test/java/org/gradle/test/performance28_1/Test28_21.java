package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_21 {
    private final Production28_21 production = new Production28_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}