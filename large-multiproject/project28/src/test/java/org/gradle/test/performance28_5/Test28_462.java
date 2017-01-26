package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_462 {
    private final Production28_462 production = new Production28_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}