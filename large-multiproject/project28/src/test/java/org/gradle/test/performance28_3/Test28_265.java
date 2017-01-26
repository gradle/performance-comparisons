package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_265 {
    private final Production28_265 production = new Production28_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}