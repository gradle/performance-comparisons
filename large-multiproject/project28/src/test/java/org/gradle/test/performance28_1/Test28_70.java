package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_70 {
    private final Production28_70 production = new Production28_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}