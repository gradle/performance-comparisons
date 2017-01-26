package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_132 {
    private final Production12_132 production = new Production12_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}