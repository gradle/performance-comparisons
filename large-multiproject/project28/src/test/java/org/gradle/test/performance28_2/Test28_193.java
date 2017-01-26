package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_193 {
    private final Production28_193 production = new Production28_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}