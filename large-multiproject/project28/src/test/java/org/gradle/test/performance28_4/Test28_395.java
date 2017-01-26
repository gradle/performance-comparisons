package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_395 {
    private final Production28_395 production = new Production28_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}