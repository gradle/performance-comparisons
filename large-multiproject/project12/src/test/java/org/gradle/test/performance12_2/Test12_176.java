package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_176 {
    private final Production12_176 production = new Production12_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}