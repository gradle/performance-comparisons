package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_206 {
    private final Production28_206 production = new Production28_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}