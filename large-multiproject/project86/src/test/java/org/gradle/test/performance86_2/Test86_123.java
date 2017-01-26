package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_123 {
    private final Production86_123 production = new Production86_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}