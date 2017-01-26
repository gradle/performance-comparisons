package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_18 {
    private final Production28_18 production = new Production28_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}