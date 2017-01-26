package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_144 {
    private final Production12_144 production = new Production12_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}