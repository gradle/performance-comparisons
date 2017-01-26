package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_381 {
    private final Production28_381 production = new Production28_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}