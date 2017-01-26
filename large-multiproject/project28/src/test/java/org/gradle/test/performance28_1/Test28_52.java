package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_52 {
    private final Production28_52 production = new Production28_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}