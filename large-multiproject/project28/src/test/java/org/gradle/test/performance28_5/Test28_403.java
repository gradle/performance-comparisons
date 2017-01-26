package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_403 {
    private final Production28_403 production = new Production28_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}