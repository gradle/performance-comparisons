package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_455 {
    private final Production28_455 production = new Production28_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}