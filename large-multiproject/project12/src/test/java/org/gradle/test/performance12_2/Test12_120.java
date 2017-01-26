package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_120 {
    private final Production12_120 production = new Production12_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}