package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_486 {
    private final Production28_486 production = new Production28_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}