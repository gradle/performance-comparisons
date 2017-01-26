package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_295 {
    private final Production12_295 production = new Production12_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}