package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_366 {
    private final Production12_366 production = new Production12_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}