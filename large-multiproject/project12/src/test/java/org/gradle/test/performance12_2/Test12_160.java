package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_160 {
    private final Production12_160 production = new Production12_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}