package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_213 {
    private final Production28_213 production = new Production28_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}