package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_345 {
    private final Production28_345 production = new Production28_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}