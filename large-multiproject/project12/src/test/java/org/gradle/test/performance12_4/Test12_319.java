package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_319 {
    private final Production12_319 production = new Production12_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}