package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_312 {
    private final Production12_312 production = new Production12_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}