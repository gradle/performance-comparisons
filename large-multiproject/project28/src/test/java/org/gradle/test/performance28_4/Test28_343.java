package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_343 {
    private final Production28_343 production = new Production28_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}