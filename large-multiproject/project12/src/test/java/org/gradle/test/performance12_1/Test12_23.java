package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_23 {
    private final Production12_23 production = new Production12_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}