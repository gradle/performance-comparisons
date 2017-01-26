package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_424 {
    private final Production28_424 production = new Production28_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}