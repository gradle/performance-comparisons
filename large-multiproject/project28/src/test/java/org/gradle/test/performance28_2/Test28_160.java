package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_160 {
    private final Production28_160 production = new Production28_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}