package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_130 {
    private final Production12_130 production = new Production12_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}