package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_407 {
    private final Production12_407 production = new Production12_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}