package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_221 {
    private final Production28_221 production = new Production28_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}