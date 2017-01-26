package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_123 {
    private final Production25_123 production = new Production25_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}