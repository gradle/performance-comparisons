package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_237 {
    private final Production28_237 production = new Production28_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}