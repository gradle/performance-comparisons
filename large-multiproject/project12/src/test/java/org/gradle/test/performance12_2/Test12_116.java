package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_116 {
    private final Production12_116 production = new Production12_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}