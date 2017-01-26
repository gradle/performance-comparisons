package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_94 {
    private final Production12_94 production = new Production12_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}