package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_129 {
    private final Production28_129 production = new Production28_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}