package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_258 {
    private final Production28_258 production = new Production28_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}