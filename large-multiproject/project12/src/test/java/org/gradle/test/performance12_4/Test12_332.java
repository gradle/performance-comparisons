package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_332 {
    private final Production12_332 production = new Production12_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}