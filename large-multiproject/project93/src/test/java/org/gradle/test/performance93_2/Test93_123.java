package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_123 {
    private final Production93_123 production = new Production93_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}