package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_381 {
    private final Production12_381 production = new Production12_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}