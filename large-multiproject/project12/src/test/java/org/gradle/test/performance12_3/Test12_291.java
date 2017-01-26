package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_291 {
    private final Production12_291 production = new Production12_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}