package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_428 {
    private final Production12_428 production = new Production12_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}