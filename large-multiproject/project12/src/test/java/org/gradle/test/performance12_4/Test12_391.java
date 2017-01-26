package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_391 {
    private final Production12_391 production = new Production12_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}