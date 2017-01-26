package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_232 {
    private final Production28_232 production = new Production28_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}