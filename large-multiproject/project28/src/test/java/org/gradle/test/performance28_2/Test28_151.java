package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_151 {
    private final Production28_151 production = new Production28_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}