package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_370 {
    private final Production28_370 production = new Production28_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}