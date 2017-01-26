package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_467 {
    private final Production28_467 production = new Production28_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}