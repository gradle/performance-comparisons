package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_318 {
    private final Production28_318 production = new Production28_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}