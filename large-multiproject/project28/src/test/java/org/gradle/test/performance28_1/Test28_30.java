package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_30 {
    private final Production28_30 production = new Production28_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}