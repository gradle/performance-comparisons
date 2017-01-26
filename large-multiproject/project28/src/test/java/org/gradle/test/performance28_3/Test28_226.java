package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_226 {
    private final Production28_226 production = new Production28_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}