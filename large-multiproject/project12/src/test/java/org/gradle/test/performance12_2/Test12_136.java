package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_136 {
    private final Production12_136 production = new Production12_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}