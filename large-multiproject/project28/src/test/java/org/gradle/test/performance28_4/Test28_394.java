package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_394 {
    private final Production28_394 production = new Production28_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}