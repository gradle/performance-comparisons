package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_164 {
    private final Production28_164 production = new Production28_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}