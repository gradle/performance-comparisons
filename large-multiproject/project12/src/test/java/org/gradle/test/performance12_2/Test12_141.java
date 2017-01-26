package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_141 {
    private final Production12_141 production = new Production12_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}