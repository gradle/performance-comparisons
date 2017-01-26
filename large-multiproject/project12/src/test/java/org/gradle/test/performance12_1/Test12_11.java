package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_11 {
    private final Production12_11 production = new Production12_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}