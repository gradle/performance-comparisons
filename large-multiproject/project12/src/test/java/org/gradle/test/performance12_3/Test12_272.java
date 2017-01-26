package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_272 {
    private final Production12_272 production = new Production12_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}