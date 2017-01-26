package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_456 {
    private final Production12_456 production = new Production12_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}