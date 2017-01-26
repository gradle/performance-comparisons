package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_402 {
    private final Production12_402 production = new Production12_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}