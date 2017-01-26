package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_490 {
    private final Production12_490 production = new Production12_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}