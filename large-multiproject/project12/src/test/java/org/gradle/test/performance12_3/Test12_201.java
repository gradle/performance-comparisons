package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_201 {
    private final Production12_201 production = new Production12_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}