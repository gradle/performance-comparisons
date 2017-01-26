package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_170 {
    private final Production12_170 production = new Production12_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}