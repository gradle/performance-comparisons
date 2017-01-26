package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_292 {
    private final Production12_292 production = new Production12_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}