package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_291 {
    private final Production28_291 production = new Production28_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}