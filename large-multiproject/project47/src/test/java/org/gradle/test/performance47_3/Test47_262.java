package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_262 {
    private final Production47_262 production = new Production47_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}