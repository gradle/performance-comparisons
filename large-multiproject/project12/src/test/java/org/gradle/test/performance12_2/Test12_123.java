package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_123 {
    private final Production12_123 production = new Production12_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}