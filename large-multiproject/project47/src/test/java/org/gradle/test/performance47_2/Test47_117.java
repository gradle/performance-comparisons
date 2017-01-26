package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_117 {
    private final Production47_117 production = new Production47_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}