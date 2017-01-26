package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_123 {
    private final Production80_123 production = new Production80_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}