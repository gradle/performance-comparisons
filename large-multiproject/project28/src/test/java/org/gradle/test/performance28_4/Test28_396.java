package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_396 {
    private final Production28_396 production = new Production28_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}