package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_123 {
    private final Production31_123 production = new Production31_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}