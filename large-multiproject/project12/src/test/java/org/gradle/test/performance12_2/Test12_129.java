package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_129 {
    private final Production12_129 production = new Production12_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}