package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_341 {
    private final Production12_341 production = new Production12_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}