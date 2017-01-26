package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_57 {
    private final Production28_57 production = new Production28_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}