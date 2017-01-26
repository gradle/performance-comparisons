package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_459 {
    private final Production28_459 production = new Production28_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}