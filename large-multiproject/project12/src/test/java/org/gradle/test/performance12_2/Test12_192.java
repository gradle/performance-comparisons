package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_192 {
    private final Production12_192 production = new Production12_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}