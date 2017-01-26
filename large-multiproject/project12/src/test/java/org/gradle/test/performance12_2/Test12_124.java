package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_124 {
    private final Production12_124 production = new Production12_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}