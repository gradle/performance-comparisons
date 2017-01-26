package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_287 {
    private final Production28_287 production = new Production28_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}