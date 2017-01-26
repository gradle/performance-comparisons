package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_79 {
    private final Production28_79 production = new Production28_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}