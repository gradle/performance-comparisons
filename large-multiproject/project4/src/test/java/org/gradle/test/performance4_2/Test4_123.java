package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_123 {
    private final Production4_123 production = new Production4_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}