package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_248 {
    private final Production12_248 production = new Production12_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}