package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_256 {
    private final Production12_256 production = new Production12_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}