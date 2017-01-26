package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_117 {
    private final Production12_117 production = new Production12_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}