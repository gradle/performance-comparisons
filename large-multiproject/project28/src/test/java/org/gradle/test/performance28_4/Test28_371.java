package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_371 {
    private final Production28_371 production = new Production28_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}