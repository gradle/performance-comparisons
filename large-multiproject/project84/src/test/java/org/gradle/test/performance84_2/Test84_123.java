package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_123 {
    private final Production84_123 production = new Production84_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}