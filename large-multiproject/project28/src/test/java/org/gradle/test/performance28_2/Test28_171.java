package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_171 {
    private final Production28_171 production = new Production28_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}