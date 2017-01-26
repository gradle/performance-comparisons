package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_420 {
    private final Production28_420 production = new Production28_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}