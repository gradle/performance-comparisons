package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_408 {
    private final Production12_408 production = new Production12_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}