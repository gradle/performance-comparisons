package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_261 {
    private final Production28_261 production = new Production28_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}