package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_178 {
    private final Production12_178 production = new Production12_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}