package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_384 {
    private final Production12_384 production = new Production12_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}