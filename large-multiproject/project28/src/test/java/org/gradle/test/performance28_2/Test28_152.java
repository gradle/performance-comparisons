package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_152 {
    private final Production28_152 production = new Production28_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}