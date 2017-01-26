package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_287 {
    private final Production12_287 production = new Production12_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}