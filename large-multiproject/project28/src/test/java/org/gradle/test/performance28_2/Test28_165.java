package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_165 {
    private final Production28_165 production = new Production28_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}