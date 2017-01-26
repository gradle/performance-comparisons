package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_342 {
    private final Production28_342 production = new Production28_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}