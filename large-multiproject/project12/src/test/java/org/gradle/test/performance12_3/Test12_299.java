package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_299 {
    private final Production12_299 production = new Production12_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}