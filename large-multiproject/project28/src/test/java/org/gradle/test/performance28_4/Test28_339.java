package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_339 {
    private final Production28_339 production = new Production28_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}