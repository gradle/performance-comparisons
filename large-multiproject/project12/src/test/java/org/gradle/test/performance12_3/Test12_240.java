package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_240 {
    private final Production12_240 production = new Production12_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}