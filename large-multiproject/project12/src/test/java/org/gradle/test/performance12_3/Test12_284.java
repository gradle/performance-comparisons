package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_284 {
    private final Production12_284 production = new Production12_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}