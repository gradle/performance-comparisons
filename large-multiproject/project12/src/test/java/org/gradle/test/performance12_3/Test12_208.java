package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_208 {
    private final Production12_208 production = new Production12_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}