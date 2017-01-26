package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_135 {
    private final Production28_135 production = new Production28_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}