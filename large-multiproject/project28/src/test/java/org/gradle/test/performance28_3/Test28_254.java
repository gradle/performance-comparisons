package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_254 {
    private final Production28_254 production = new Production28_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}