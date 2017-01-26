package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_79 {
    private final Production12_79 production = new Production12_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}