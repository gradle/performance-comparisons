package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_420 {
    private final Production12_420 production = new Production12_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}