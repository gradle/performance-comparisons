package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_443 {
    private final Production12_443 production = new Production12_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}