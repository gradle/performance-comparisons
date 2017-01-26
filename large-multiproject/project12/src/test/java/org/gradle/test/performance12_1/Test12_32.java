package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_32 {
    private final Production12_32 production = new Production12_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}