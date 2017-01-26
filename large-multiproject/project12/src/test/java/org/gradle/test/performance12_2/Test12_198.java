package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_198 {
    private final Production12_198 production = new Production12_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}