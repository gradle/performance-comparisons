package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_55 {
    private final Production28_55 production = new Production28_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}