package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_409 {
    private final Production12_409 production = new Production12_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}