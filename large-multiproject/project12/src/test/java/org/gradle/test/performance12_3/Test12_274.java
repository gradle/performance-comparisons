package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_274 {
    private final Production12_274 production = new Production12_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}