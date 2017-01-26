package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_123 {
    private final Production58_123 production = new Production58_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}