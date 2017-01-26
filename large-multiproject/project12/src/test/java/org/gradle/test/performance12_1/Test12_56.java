package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_56 {
    private final Production12_56 production = new Production12_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}