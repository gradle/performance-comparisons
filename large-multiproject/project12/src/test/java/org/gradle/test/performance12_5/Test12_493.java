package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_493 {
    private final Production12_493 production = new Production12_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}