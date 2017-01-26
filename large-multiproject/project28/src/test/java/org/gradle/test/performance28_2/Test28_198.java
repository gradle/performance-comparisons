package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_198 {
    private final Production28_198 production = new Production28_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}