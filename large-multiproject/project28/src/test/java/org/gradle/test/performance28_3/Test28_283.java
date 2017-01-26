package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_283 {
    private final Production28_283 production = new Production28_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}