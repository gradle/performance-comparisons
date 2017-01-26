package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_153 {
    private final Production12_153 production = new Production12_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}