package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_236 {
    private final Production12_236 production = new Production12_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}