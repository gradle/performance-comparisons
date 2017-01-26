package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_110 {
    private final Production12_110 production = new Production12_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}