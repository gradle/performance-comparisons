package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_320 {
    private final Production12_320 production = new Production12_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}