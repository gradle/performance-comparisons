package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_159 {
    private final Production12_159 production = new Production12_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}