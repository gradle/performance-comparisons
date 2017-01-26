package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_448 {
    private final Production12_448 production = new Production12_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}