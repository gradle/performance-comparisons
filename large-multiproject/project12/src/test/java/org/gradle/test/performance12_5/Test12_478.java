package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_478 {
    private final Production12_478 production = new Production12_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}