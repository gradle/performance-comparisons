package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_258 {
    private final Production12_258 production = new Production12_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}