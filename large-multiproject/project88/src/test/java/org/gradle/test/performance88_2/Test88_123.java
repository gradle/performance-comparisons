package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_123 {
    private final Production88_123 production = new Production88_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}