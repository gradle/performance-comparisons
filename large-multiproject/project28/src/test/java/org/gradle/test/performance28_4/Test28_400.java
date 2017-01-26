package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_400 {
    private final Production28_400 production = new Production28_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}