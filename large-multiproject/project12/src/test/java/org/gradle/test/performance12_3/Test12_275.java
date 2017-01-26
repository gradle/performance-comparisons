package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_275 {
    private final Production12_275 production = new Production12_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}