package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_359 {
    private final Production12_359 production = new Production12_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}