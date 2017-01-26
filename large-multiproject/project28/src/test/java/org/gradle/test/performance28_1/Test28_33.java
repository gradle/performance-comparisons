package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_33 {
    private final Production28_33 production = new Production28_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}