package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_245 {
    private final Production12_245 production = new Production12_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}