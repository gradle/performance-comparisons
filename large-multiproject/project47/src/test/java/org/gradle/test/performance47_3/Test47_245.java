package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_245 {
    private final Production47_245 production = new Production47_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}