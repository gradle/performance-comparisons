package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_123 {
    private final Production37_123 production = new Production37_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}