package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_131 {
    private final Production28_131 production = new Production28_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}