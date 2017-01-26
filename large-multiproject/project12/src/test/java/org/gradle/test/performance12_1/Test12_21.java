package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_21 {
    private final Production12_21 production = new Production12_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}