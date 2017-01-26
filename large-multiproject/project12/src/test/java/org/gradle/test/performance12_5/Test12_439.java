package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_439 {
    private final Production12_439 production = new Production12_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}