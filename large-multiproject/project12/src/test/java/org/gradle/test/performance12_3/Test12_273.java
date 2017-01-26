package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_273 {
    private final Production12_273 production = new Production12_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}