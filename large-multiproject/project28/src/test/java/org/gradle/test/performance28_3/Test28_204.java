package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_204 {
    private final Production28_204 production = new Production28_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}