package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_123 {
    private final Production75_123 production = new Production75_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}