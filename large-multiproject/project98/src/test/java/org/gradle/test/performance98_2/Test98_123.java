package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_123 {
    private final Production98_123 production = new Production98_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}