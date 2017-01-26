package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_50 {
    private final Production12_50 production = new Production12_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}