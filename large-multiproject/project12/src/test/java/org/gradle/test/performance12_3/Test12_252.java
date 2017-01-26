package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_252 {
    private final Production12_252 production = new Production12_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}