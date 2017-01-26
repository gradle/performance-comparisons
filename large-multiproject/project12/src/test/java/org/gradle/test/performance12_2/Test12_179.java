package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_179 {
    private final Production12_179 production = new Production12_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}