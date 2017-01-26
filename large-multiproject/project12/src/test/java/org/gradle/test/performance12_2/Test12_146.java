package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_146 {
    private final Production12_146 production = new Production12_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}