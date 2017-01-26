package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_83 {
    private final Production28_83 production = new Production28_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}