package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_284 {
    private final Production28_284 production = new Production28_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}