package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_254 {
    private final Production12_254 production = new Production12_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}