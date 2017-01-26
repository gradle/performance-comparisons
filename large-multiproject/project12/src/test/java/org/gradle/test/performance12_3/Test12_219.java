package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_219 {
    private final Production12_219 production = new Production12_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}