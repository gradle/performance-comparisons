package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_177 {
    private final Production12_177 production = new Production12_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}