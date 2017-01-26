package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_103 {
    private final Production28_103 production = new Production28_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}