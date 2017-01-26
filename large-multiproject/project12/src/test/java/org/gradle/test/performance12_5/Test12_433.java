package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_433 {
    private final Production12_433 production = new Production12_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}