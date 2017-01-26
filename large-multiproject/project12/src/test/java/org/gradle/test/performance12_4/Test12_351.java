package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_351 {
    private final Production12_351 production = new Production12_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}