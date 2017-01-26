package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_127 {
    private final Production28_127 production = new Production28_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}