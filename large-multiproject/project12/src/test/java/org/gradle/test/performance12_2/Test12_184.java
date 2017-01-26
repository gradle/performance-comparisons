package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_184 {
    private final Production12_184 production = new Production12_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}