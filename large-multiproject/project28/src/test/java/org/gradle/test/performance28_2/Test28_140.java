package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_140 {
    private final Production28_140 production = new Production28_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}