package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_397 {
    private final Production12_397 production = new Production12_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}