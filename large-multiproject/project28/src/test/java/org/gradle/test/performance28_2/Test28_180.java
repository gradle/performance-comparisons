package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_180 {
    private final Production28_180 production = new Production28_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}