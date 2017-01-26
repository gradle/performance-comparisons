package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_242 {
    private final Production12_242 production = new Production12_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}