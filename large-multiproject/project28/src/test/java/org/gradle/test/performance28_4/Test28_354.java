package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_354 {
    private final Production28_354 production = new Production28_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}