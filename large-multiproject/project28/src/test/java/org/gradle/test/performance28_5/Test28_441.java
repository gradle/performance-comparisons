package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_441 {
    private final Production28_441 production = new Production28_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}