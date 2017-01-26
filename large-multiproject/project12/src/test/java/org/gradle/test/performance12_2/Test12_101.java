package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_101 {
    private final Production12_101 production = new Production12_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}