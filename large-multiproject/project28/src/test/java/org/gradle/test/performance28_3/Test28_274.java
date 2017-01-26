package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_274 {
    private final Production28_274 production = new Production28_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}