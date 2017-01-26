package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_122 {
    private final Production28_122 production = new Production28_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}