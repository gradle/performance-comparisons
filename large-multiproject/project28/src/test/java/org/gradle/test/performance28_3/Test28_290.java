package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_290 {
    private final Production28_290 production = new Production28_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}