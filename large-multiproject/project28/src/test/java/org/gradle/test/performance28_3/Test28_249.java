package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_249 {
    private final Production28_249 production = new Production28_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}