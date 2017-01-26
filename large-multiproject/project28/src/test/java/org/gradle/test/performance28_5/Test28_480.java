package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_480 {
    private final Production28_480 production = new Production28_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}