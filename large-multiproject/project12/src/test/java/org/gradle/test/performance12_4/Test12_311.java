package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_311 {
    private final Production12_311 production = new Production12_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}