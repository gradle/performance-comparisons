package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_463 {
    private final Production12_463 production = new Production12_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}