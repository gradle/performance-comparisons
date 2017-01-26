package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_459 {
    private final Production12_459 production = new Production12_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}