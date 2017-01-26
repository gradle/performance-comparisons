package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_232 {
    private final Production12_232 production = new Production12_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}