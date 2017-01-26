package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_208 {
    private final Production28_208 production = new Production28_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}