package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_64 {
    private final Production28_64 production = new Production28_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}