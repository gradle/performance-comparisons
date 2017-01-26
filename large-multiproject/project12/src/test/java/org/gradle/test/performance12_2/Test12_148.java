package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_148 {
    private final Production12_148 production = new Production12_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}